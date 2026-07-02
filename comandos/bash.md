# Comandos básicos de Bash

Se adjuntan una seride comandos básicos para el uso de Bash, recuerden que todo lo que involucra eliminar son cambios permanentes.

## Print working directory: pwd
Muestra la ruta absoluta del directorio de trabajo actual.

### Ejemplos
- Sin argumentos: Muestra el directorio actual.
```bash
pwd
```

---

## List: ls
Muestra los archivos y directorios contenidos en el directorio actual.

### Ejemplos
- Sin argumentos: Muestra los archivos del directorio actual.
```bash
ls
```

- Un argumento (directorio): Muestra el contenido del directorio indicado.
```bash
ls <directorio>
```

- Bandera `-a`: Muestra también los archivos ocultos.
```bash
ls -a
```

- Bandera `-l`: Muestra la información detallada de cada archivo.
```bash
ls -l
```


_Nota: Se pueden combinar varias banderas en un mismo comando como `-la`._

---

## Change directory: cd
Permite cambiar el directorio de trabajo.

### Ejemplos
- Sin argumentos: Cambia al directorio personal.
```bash
cd
```

- Un argumento directorio: Cambia al directorio indicado.
```bash
cd <directorio>
```

- Regresar al directorio anterior.
```bash
cd ..
```

- Regresar al directorio raíz.
```bash
cd /
```

---

## Make directory: mkdir
Crea uno o varios directorios.

### Ejemplos
- Crear un directorio.
```bash
mkdir <directorio_nuevo>
```

- Crear varios directorios.
```bash
mkdir <directorio1> <directorio2> <directorio3>
```

---

## Create file: touch
Crea un archivo vacío o actualiza la fecha de modificación de un archivo existente.

### Ejemplos
- Crear un archivo.
```bash
touch <archivo>
```

- Crear varios archivos.
```bash
touch <archivo1> <archivo2> <archivo3>
```

---

## Copy: cp
Copia archivos o directorios.

### Ejemplos
- Copiar un archivo.
```bash
cp <archivo> <copia>
```

- Copiar un archivo a otro directorio.
```bash
cp <archivo> <directorio>
```

- Copiar un directorio de forma recursiva.
```bash
cp -r <directorio_viejo> <nuevo_directorio>
```

---

## Move (Rename): mv
Mueve archivos entre directorios o cambia su nombre.

### Ejemplos
- Mover un archivo a otro directorio.
```bash
mv <archivo> <directorio_que_lo_contendrá>
```

- Mover un directorio.
```bash
mv <directorio_viejo> <directorio_nuevo>
```

- Renombrar un archivo.
```bash
mv <archivo_con_nombre_viejo> <archivo_con_nuevo_nombre>
```

---

## Remove: rm
Elimina archivos o directorios.

### Ejemplos
- Eliminar un archivo.
```bash
rm <archivo>
```

- Eliminar varios archivos.
```bash
rm <archivo1> <archivo2>
```

- Eliminar un directorio de forma recursiva.
```bash
rm -r <directorio>
```

- Forzar la eliminación sin pedir confirmación.
```bash
rm -rf <directorio>
```

---

## Concatenate: cat
Muestra el contenido de uno o varios archivos.

### Ejemplos
- Mostrar un archivo.
```bash
cat <archivo>
```

- Mostrar varios archivos.
```bash
cat <archivo1> <archivo2>
```

- Crear un archivo desde la terminal.
```bash
cat > <archivo>
```

---

## Echo: echo
Imprime texto en la terminal o lo redirige a un archivo.

### Ejemplos
- Imprimir un mensaje.
```bash
echo "Hola mundo"
```

- Guardar texto en un archivo.
```bash
echo "Hola mundo" > <archivo>
```

- Agregar texto al final de un archivo.
```bash
echo "Nueva línea" >> <archivo>
```

---

## Find: find
Busca archivos y directorios según diferentes criterios.

### Ejemplos
- Buscar un archivo por nombre.
```bash
find . -name <nombre_a_buscar>
```

- Buscar todos los archivos con extensión `.txt`.
```bash
find . -name "*.txt"
```

- Buscar únicamente directorios.
```bash
find . -type d
```

---

## Grep: grep
Busca texto dentro de archivos.

### Ejemplos
- Buscar una palabra en un archivo.
```bash
grep "Hola" <archivo>
```

- Ignorar mayúsculas y minúsculas.
```bash
grep -i "hola" <archivo>
```

- Buscar en todos los archivos `.txt`.
```bash
grep "Hola" *.txt
```

---

## Manual: man
Muestra el manual de un comando.

### Ejemplos
- Ver el manual de `ls`.
```bash
man ls
```

- Ver el manual de `grep`.
```bash
man grep
```

---

## Help: --help
Muestra una ayuda rápida sobre un comando.

### Ejemplos
- Ayuda de `ls`.
```bash
ls --help
```

- Ayuda de `mkdir`.
```bash
mkdir --help
```