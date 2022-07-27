package main

import (
	"fmt"
	"time"
)

type Data interface{

}

type PersonI interface {
	create()
	update()
	get()
}

type PersonS struct {
	dni		string
	birthDate time.Time
	phone 	string
}

func (p *PersonS) create(dni , phone string , date time.Time){
	p.birthDate = date;
	p.dni = dni;
	p.phone = phone;
}
func (p *PersonS) update(data PersonS){
	p.birthDate = data.birthDate;
	p.dni = data.dni;
	// fmt.Printf()
	if data.phone != "" {
		p.phone = data.phone ;
	}
}

func main() {
	carlitos := PersonS{}
	start := time.Now()

	carlitos.create("304534563","12345678",start.Local())
	
	fmt.Printf("calitos tiene \nDni: %s \nFecha Nac: %s\nTelefono: %s", carlitos.dni, carlitos.birthDate, carlitos.phone);
	
	fmt.Print("\n")
	fmt.Print(time.Date(1997,9,8,0,0,0,0,*&time.Local))
	
	data := PersonS{
		birthDate: start.Local(),
		dni: "23145",
	}

	carlitos.update(data)

	fmt.Printf("calitos tiene \nDni: %s \nFecha Nac: %s\nTelefono: %s", carlitos.dni, carlitos.birthDate, carlitos.phone);

}

// func  todo(a *Car){
// 	a.numero = 3;
// 	a.nombre = "chau";
// 	// return *a
// }