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
  El programa se realizó en la versión 7.4 del IDE NetBeans. Para poder ejecutar esta aplicacion solo es nesesario la instalacion de JRE 7.51 o superior.El ejecutable se encuentra en la carpeta **EstacionamientoBenitez/dist/**
 
 ## Uso y Guia Basica
 Al inicializar el programa se necesita comprobar su identidad con un Usuario y Contraseña previamente acordado en el negocio, luego de iniciar sesion entramos a la ventana principal de este donde se podra comenzar a registrar los Clientes y Vehiculos que estacionaran en nuesrto parqueo. Tambien hay un registro de los Empleados que trabajan en el Estacionamiento otro para guardar datos estadisticos del parqueo.
 
 ## Colaboradores:
 * [Jorge Luis Hechavarria]( https://github.com/JorgeUmcc )
 * [Luis Denis Ramirez](https://github.com/luisdenys0126)
 * [Cristian Alejandro Rodriguez](https://github.com/crissrdguez)
 * [Keiber Reconde](https://github.com/keiber21)
 
 ## Descripcion individual de los modulos de los colaboradores
 ### Jorge Luis Hechavarria

 Daré una explicación detallada de mi parte del negocio y del negocio en general, en el parqueo trabaja un encargado, jefe de turno,o parquedor cómo lo quieran llamar, él y sólo él es el encargado de utilizar y gestionar la información que está en la aplicación, este puesto cuenta con 3 turnos, osea que en total solo 3 personas tienen el conocimiento y la autorización de ingresar a la aplicación, cada uno de ellos cuenta con un usuario y contraseña que solo ellos conocen y así se restringe la entrada, al ejecutar el programa la primera ventana que se sale es la del Login, cuando el Usuario se autentique en la aplicación puede acceder a la ventana principal donde están los campos de gestión de Clientes, Vehículos, Empleados y Estadísticas. Cuando un auto ingresa a el estacionamiento y parquea el dueño se tiene que dirigir
hacia la garita o PSP donde se encuentra el encargado y brindarle los datos que este le pida, datos que este encargado introducirá en la aplicación para su almacenamiento. Antes de que el cliente se valla y abandone el parqueo tiene que ir otra vez a la garita y pagar el tiempo que estuvo parqueado su auto, entonces es cuando culmina el negocio.

 El modulo que realicé consiste en la gestión de Usuarios y Clientes del proyecto, con este enlace se puede visualizar mi porción del Diagrama UML de Visual Parading
 ![Screenshot](https://github.com/JorgeUmcc/ProyectoParqueo.VP/blob/main/Imagen%20del%20modulo%20de%20JORGE/Porcion%20de%20JorgeUmcc.jpg)

Para la realizacion de esta parte del proyecto utilice las clases Usuario y Cliente del paquete modelo realizando varios metodos para guardar la informacion con el Trabajo con archivos, primeramente hice una especie de login que es lo primero que ejecuta el main y me permite controlar el acceso al porgrama en la creación de este login interviene la clase Usuario del paquete Modelo y sus respectivos atributos, tambien esta implementada la interface grafica de la ventana del Login y la interfaz grafica de la ventana donde se gestionaran los clientes del estacionamiento.
A continuacion mopstraré mediante links el codigo de dichas clases y los metodos de guardado ulilizados en la clase GuardarArchivos.
https://github.com/JorgeUmcc/ProyectoParqueo.Code/blob/ad368e595ed97a948fec4eb8da38c8bde83e9041/EstacionamientoBenitez/src/Modelo/Cliente.java#L15-L73
https://github.com/JorgeUmcc/ProyectoParqueo.Code/blob/5ad97aa8e4264e175cd1ad34907359d7466e7a05/EstacionamientoBenitez/src/Modelo/Usuario.java#L15-L53
https://github.com/JorgeUmcc/ProyectoParqueo.Code/blob/5ad97aa8e4264e175cd1ad34907359d7466e7a05/EstacionamientoBenitez/src/Controlador/GuardarArchivos.java#L7-L144
 
 
 ### Luis Denis Ramirez
 Mi porción del proyecto es la gestión de la información del mismo para hacerlo cree el módulo gestión de la información e implemente la clase gestión de estadística la cual está formada por cuatro atributos 1: matrícula 2: hora entrada 3: hora salida 4: número de plazas y sus respectivos métodos. En el siguiente enlace se puede ver la parte de mi diagrama UML en Visual Parading:
 
![Screenshot](https://github.com/JorgeUmcc/ProyectoParqueo.VP/blob/main/Imagen%20del%20modulo%20de%20LUIS/Luis%20Denis.jpg )

 La manera de utilizarlo es la siguiente: Después de que el encargado o jefe de turno ingresé a la aplicación y introduzca su usuario y contraseña y está verifique q son correctos intrucira la hora de entrada del vehículo y la el número de la plaza del parqueo en el cual se va a ubicar al igual que su matrícula la cual tiene que coincidir después con la que se introduzca en gestión de la información y una vez el vehículo se retire se anotará la hora de salida de este y así tener un control total de la cantidad de plazas q están ocupadas  y libres de esta manera el parque va a tener una mayor organización y sabiendo las plazas libres y ocupada le ahorrarán tiempo al cliente a la hora de estacionar su vehículo .
 
 ### Keiber Reconde
 La descripcion de mi porcion del proyecto es:Luego de que el encargado o jefe de turno entre a la aplicacion y se autentique con su usuario y contrasenna podra acceder a mi modulo que es la gestion de los vehiculos del parqueo.Cuando el cliente se acerque al encargado este le pedira los datos de su vehiculo que son la matricula,el modelo y el color para tener constancia y conocer cual es el vehiculo del cliente.
 
 El modulo que hice consiste en la gestion de vehiculos del estacionamiento, a continuacion mostrare mi diagrama UMl
 ![Screenshot](https://github.com/JorgeUmcc/ProyectoParqueo.VP/blob/main/Imagen%20del%20modulo%20de%20KEIBER/KEIBER.jpg)
 
 Para la realizacion de  esta parte utilice la clase Vehiculos realizando en este varios metodos para guardar los datos de cada vehiculo que se estaciona en el parqueo con sus respectivos atributos,introduciendo y guardando el modelo, elcolor, la matricula y el propietario de cada automovil,permitiendo una mayor organizacion para tener constancia y saber el vehiculo de cada cliente. Tambien esta implementada la interfaz grafica donde se encuentra los datos de cada vehiculo de sus respectivos clientes. 
A continuacion les mostrare el siguiente enlace de la clase que realice:
 https://github.com/JorgeUmcc/ProyectoParqueo.Code/blob/5ad97aa8e4264e175cd1ad34907359d7466e7a05/EstacionamientoBenitez/src/Modelo/Vehiculo.java#L15-L68
 
A continuacion les mostrare la interfaz grafica que realice:
 https://github.com/JorgeUmcc/ProyectoParqueo.Code/blob/5ad97aa8e4264e175cd1ad34907359d7466e7a05/EstacionamientoBenitez/src/Vista/Vehiculos.java#L15-L275

 
 
### Cristian Alejandro Rodriguez
 Mi parte en el proyecto corresponde a a todo lo que concierne a la gestion de empleado,su clase asi como sus atributos y las interfaz grafica correspondiente.La clase empleado cuenta con 3 atributos:horario,cargo y sueldo;asi como los que herada de la clase persona,los cuales permiten un control eficaz de los empleados de la empresa.En el siguiente enlace se encuentra la clase empleado mas detallada en diagrama UML :
 ![Screenshot](https://github.com/JorgeUmcc/ProyectoParqueo.VP/blob/main/Imagen%20del%20modulo%20de%20CRISTIAN/CRISTIAN.jpg)
 Una vez que el usuario inicie sesion en la aplicacion tendra a la vista el Boton "Empleado" el cual lo llevara a la ventana en la cual se encuentran alojados los datos.Una vez aqui puede intrudir nuevos datos de empleados,cambiar algunos o eliminarlos,cambios q podra guardar al presionar Ctrl+s o en la esquina superior izquierda presionando el menu desplegable la opcion "Guardar cambios".Para salir hacia el menu principal se presiona en el menu desplegable la opcion "Volver al menu" o se presiona Ctrl+z.


 


