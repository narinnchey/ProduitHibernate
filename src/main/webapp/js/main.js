var formatter = new Intl.NumberFormat('fr-FR', {
	style: 'currency',
	currency: 'EUR'
});

document.querySelectorAll(".prix").forEach(elt => {
	elt.textContent = formatter.format(elt.textContent);
});