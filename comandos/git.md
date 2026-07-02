# Comandos básicos de Git

## Version
Muestra la versión de Git instalada.

### Ejemplos
- Mostrar la versión instalada.
```bash
git --version
```

---

## Configuración base
Estos comandos te permitirán configurar tu cuenta de git que usarás en tu sistema

- Asignar nuevo nombre de usuario.

- Asignar nuevo correo electrónico.

- Abrir archivo de configuración en tu editor de texto.

---

## Initialize repository: git init
Inicializa un nuevo repositorio de Git en el directorio actual.

### Ejemplos
- Crear un repositorio vacío.
```bash
git init
```

- Inicializar un repositorio con un nombre de rama específico.
```bash
git init -b <nombre-de-la-rama>
```

---

## Clone repository: git clone
Copia un repositorio remoto a la máquina local.

### Ejemplos
- Clonar un repositorio.
```bash
git clone <url>
```

- Clonar un repositorio en un directorio específico.
```bash
git clone <url> <directorio>
```

---

## Status: git status
Muestra el estado actual del repositorio.

### Ejemplos
- Ver el estado de los archivos.
```bash
git status
```

- Mostrar el estado en formato corto.
```bash
git status -s
```

---

## Add: git add
Agrega archivos al área de preparación (staging).

### Ejemplos
- Agregar un archivo.
```bash
git add <archivo>
```

- Agregar varios archivos.
```bash
git add <archivo1> <archivo2>
```

- Agregar todos los archivos modificados.
```bash
git add .
```

---

## Commit: git commit
Guarda los cambios preparados en el historial del repositorio.

### Ejemplos
- Crear un commit con un mensaje corto.
```bash
git commit -m "Primer commit"
```

- Crear un commit con un mensaje.
```bash
git commit
```
_Nota: Este comando abre su editor de texto estabelcido por defecto, en este escriben el mensaje. Útil para mensajes de más de una linea_

- Agregar y confirmar archivos rastreados en un solo comando.
```bash
git commit -am "Actualización del proyecto"
```

_Nota: La bandera `-a` solo funciona con archivos que ya están siendo rastreados por Git._

---

## Log: git log
Muestra el historial de commits.

### Ejemplos
- Ver el historial completo.
```bash
git log
```

- Ver el historial resumido.
```bash
git log --oneline
```

- Ver un historial gráfico.
```bash
git log --oneline --graph
```

---

## Branch: git branch
Permite administrar ramas del repositorio.

### Ejemplos
- Mostrar las ramas existentes.
```bash
git branch
```

- Mostrar las ramas existentes, incluyendo las remotas.
```bash
git branch -a
```

- Crear una nueva rama.
```bash
git branch <nueva-rama>
```

- Eliminar una rama.
```bash
git branch -d <rama-a-eliminar>
```

---

## Checkout: git checkout
Permite cambiar de rama o restaurar archivos.

### Ejemplos
- Cambiar a otra rama.
```bash
git checkout <rama>
```

- Restaurar archivos
```bash
git checkout -- <archivo>
```

- Crear y cambiar a una nueva rama.
```bash
git checkout -b <nueva-rama>
```

---

## Switch: git switch
Cambia entre ramas (comando moderno).

### Ejemplos
- Cambiar de rama.
```bash
git switch <rama>
```

- Crear una rama y cambiar a ella.
```bash
git switch -c nueva-rama
```

---

## Merge: git merge
Fusiona los cambios de una rama con la rama actual.

### Ejemplos
- Fusionar una rama.
```bash
git merge desarrollo
```

---

## Remote: git remote
Administra los repositorios remotos.

### Ejemplos
- Mostrar los remotos configurados.
```bash
git remote -v
```

- Agregar un remoto.
```bash
git remote add origin <url>
```

- Eliminar un remoto.
```bash
git remote remove origin
```

---

## Push: git push
Envía los commits locales al repositorio remoto.

### Ejemplos
- Enviar la rama actual.
```bash
git push origin <rama>
```

- Enviar una rama y establecer seguimiento.
```bash
git push -u origin <rama>
```

---

## Pull: git pull
Descarga e integra los cambios del repositorio remoto.

### Ejemplos
- Actualizar la rama actual.
```bash
git pull
```

- Actualizar desde una rama específica.
```bash
git pull origin <rama>
```

---

## Fetch: git fetch
Descarga los cambios del repositorio remoto sin fusionarlos.

### Ejemplos
- Descargar cambios.
```bash
git fetch
```

- Descargar desde un remoto específico.
```bash
git fetch origin
```

---

## Diff: git diff
Muestra las diferencias entre archivos o commits.

### Ejemplos
- Ver cambios sin preparar.
```bash
git diff
```

- Ver cambios preparados.
```bash
git diff --staged
```

---

## Restore: git restore
Restaura archivos a un estado anterior.

### Ejemplos
- Descartar cambios en un archivo.
```bash
git restore <archivo>
```

- Quitar un archivo del área de preparación.
```bash
git restore --staged <archivo>
```

---

## Reset: git reset
Modifica el área de preparación o el historial de commits.

### Ejemplos
- Quitar un archivo del staging.
```bash
git reset <archivo>
```

- Regresar al commit anterior conservando los cambios.
```bash
git reset --soft HEAD~1
```

- Regresar eliminando los cambios.
```bash
git reset --hard HEAD~1
```

_Nota: `--hard` elimina permanentemente los cambios no respaldados._

---

## Remove: git rm
Elimina archivos del repositorio y del sistema de archivos.

### Ejemplos
- Eliminar un archivo.
```bash
git rm <archivo>
```

- Eliminar un archivo únicamente del repositorio.
```bash
git rm --cached <archivo>
```

---

## Show: git show
Muestra información detallada de un commit.

### Ejemplos
- Mostrar el último commit.
```bash
git show
```

- Mostrar un commit específico.
```bash
git show <hash>
```

---

## Stash: git stash
Guarda temporalmente los cambios sin hacer un commit.

### Ejemplos
- Guardar los cambios actuales.
```bash
git stash
```

- Recuperar los cambios guardados.
```bash
git stash pop
```

- Mostrar la lista de cambios guardados.
```bash
git stash list
```