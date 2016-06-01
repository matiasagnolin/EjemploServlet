function validarSubmit() {
	if (document.getElementById("inputNombre").value == "") {
		alert("ingrese un nombre");
		return false;
	}

	if (document.getElementById("inputApellido").value == "") {
		alert("ingrese un apellido");
		return false;
	}
	return true;
}