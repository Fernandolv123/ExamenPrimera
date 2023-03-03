#Partimos de la última version de ubuntu
FROM ubuntu:latest
#Cambiamos una variable del sistema para poder proceder con la instalacion (si no se queda esperando valores que no podemos añadir)
ENV DEBIAN_FRONTEND=noninteractive
#Descargamos las aplicaciones necesarias
RUN apt update
RUN apt-get install -y apache2
RUN apt-get install apache2-utils -y
RUN apt-get install php8.1 -y
RUN apt-get install git -y
#Cambiamos el directorio de trabajo al de salida web de apache
WORKDIR /var/www/html
#Clonamos un repositorio php que consta con una calculadora
RUN git clone https://gist.github.com/anampl/9a87a1c43bd923eb939a
#Exponemos el puerto 80
EXPOSE 80
#Ejecutamos apache como comando por defecto
CMD ["apache2ctl", "-D", "FOREGROUND"] 
