# Proyecto Parqueo 

## Datos Generales:
Este es el Proyecto Final de la asignatura Diseño y Programacion Orientada a Objetos del segundo semestre de la carrera Ingenieria Informatica en la Universidad de Matanzas.El objetivo de este Proyecto es dessarrollar un Software que permita la gestión del 
 Estacionamiento Benitez que se ubica en la calle 13 del centro Pereira, siendo
 este un sector con buena cantidad de flujo vehicular. Los metodos que lleva a cabo para el
 control de acceso al estacionamiento es antiguo por lo que se genera una mala organizacion
 en el registro y los balances financieros del negocio. Con la aplicacion de este Softwere
 en el funcionamiento del estacionamiento se evitarán la perdida de registros y problemas 
 en la busqueda de informacion y estadisticas relacionadas con el mismo.

## Estructura y Funcionalidades:
  El sistema está desarrollado por modulos, teniendo un modulo para el control de acceso
 que permite registrar el vehiculo mediante sus caracteristicas, a su vez tiene una seccion
 similar para la gestion de los Clientes y los Empleados. Ademas contará con un modulo 
 estadístico que por medio de la recoleccion de informacion durante un determinado periodo
 permite una mejor gestion del tiempo de cada vehiculo en el Estacionamiento asi como poder
 determinar de una forma rapida y eficas su propietario.

  ## Lenguaje, Arquitectura y Metodología: 
  - El lenguaje utulizado fue Java(7.51).
  - En la realizacion de este proyecto se utilizó el Patrón de Arquitectura de Softwere 
 (Modelo, Vista , Controlador) desarrollando la aplicacion de forma modular, separando los datos
 y principalmente lo que es la logioca del negocio, su representacion y su visualizacion.
 - Tambien se utilizo la Metodologia Agil ya que esta busca proporcionar en poco tiempo pequeñas piezas
 de software en funcionamiento para aumentar la satisfacción del cliente. Estas metodologías utilizan 
 enfoques flexibles y el trabajo en equipo para ofrecer mejoras constantes basados en el desarrollo 
 iterativo e incremental, donde los requisitos y soluciones evolucionan con el tiempo según la necesidad
 del proyecto.
 
 ## Instalacion:
 Para poder ejecutar esta aplicacion solo es nesesario la instalacion de JRE 7.51 o superior.El ejecutable se encuentra en la carpeta **EstacionamientoBenitez/dist/**
 
 ## Uso y Guia Basica
 Al inicializar el programa se necesita comprobar su identidad con un Usuario y Contraseña previamente acordado en el negocio, luego de iniciar sesion entramos a la ventana principal de este donde se podra comenzar a registrar los Clientes y Vehiculos que estacionaran en nuesrto parqueo. Tambien hay un registro de los Empleados que trabajan en el Estacionamiento otro para guardar datos estadisticos del parqueo.
 
 ## Colaboradores:
 * [Jorge Luis Hechavarria]( https://github.com/JorgeUmcc )
 * [Luis Denis Ramirez](https://github.com/luisdenys0126)
 * [Cristian Alejandro Rodriguez](https://github.com/crissrdguez)
 * [Keiber Reconde](https://github.com/keiber21)
 
 ## Descripcion de los modulos de los colaboradores
 ### Jorge Luis Hechavarria
 El modulo consiste en la gestión de Usuarios y Clientes del proyecto, con este enlace se puede visualizar mi porción del Diagrama UML de Visual Parading
 * (https://github.com/JorgeUmcc/ProyectoParqueo.VP/blob/main/Imagen%20del%20modulo%20de%20JORGE/Porcion%20de%20JorgeUmcc.jpg)

Para la realizacion de esta parte del proyecto utilice las clases Usuario y Cliente del paquete modelo realizando varios metodos para guardar la informacion con el Trabajo con archivos, hice una especie de login que es lo primero que ejecuta el main y me permite controlar el acceso al porgrama, tambien estan implementadas las interfaces graficas del Login y el modulo de Clientes.
A continuacion mopstraré mediante links el codigo de dichas clases y los metodos de guardado ulilizados en la clase GuardarArchivos.
* (https://github.com/JorgeUmcc/ProyectoParqueo.Code/blob/main/EstacionamientoBenitez/src/Modelo/Cliente.java)
* (https://github.com/JorgeUmcc/ProyectoParqueo.Code/blob/main/EstacionamientoBenitez/src/Modelo/Usuario.java)
* (https://github.com/JorgeUmcc/ProyectoParqueo.Code/blob/main/EstacionamientoBenitez/src/Controlador/GuardarArchivos.java)
 
 


