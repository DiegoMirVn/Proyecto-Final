/**
 * 
 */

window.onload = () => (
	document.getElementById("btnBuscar").addEventListener("click", (evento) => {
		let ciudad = document.getElementById("ciudad").value;
		let especialidad = document.getElementById("especialidad").value.toUpperCase();


		let url = "";
		if (ciudad === "" && especialidad === "") {
			url = "/sinTerapeutas";
		}
		else if (ciudad === "") {
			url = "/especialidades?especialidad=" + especialidad;
		}
		else if (especialidad === "") {
			url = "/ciudades?ciudad=" + ciudad;
		}

		else {

			url = "/listaTerapeutas?ciudad=" + ciudad + "&especialidad=" + especialidad;
		}

		window.location.href = url;
	})
)