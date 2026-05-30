document.getElementById('converterForm').addEventListener('submit', async (e) => {
    e.preventDefault(); 

    const amountInput = document.getElementById('amount').value;
    const fromCurrency = document.getElementById('fromCurrency').value;
    const toCurrency = document.getElementById('toCurrency').value;

    const resultContainer = document.getElementById('resultContainer');
    const resultValue = document.getElementById('resultValue');
    const errorContainer = document.getElementById('errorContainer');

    resultContainer.classList.add('hidden');
    errorContainer.classList.add('hidden');

    const requestPayload = {
        from: fromCurrency,
        to: toCurrency,
        amount: parseFloat(amountInput)
    };

    try {
        const response = await fetch('/api/convert', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(requestPayload)
        });

        if (!response.ok) throw new Error(`Status: ${response.status}`);

        const data = await response.json();
        
        if (data && data.convertedAmount !== undefined) {
            const formattedTotal = data.convertedAmount.toLocaleString(undefined, {
                minimumFractionDigits: 2,
                maximumFractionDigits: 2
            });
            
            resultValue.textContent = `${formattedTotal} ${toCurrency}`;
            resultContainer.classList.remove('hidden');
        }

    } catch (error) {
        console.error(error);
        errorContainer.textContent = "Conversion mapping error.";
        errorContainer.classList.remove('hidden');
    }
});