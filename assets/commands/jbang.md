# TAGLINE

runs Java programs as scripts without build tools

# TLDR

**Run Java script**

```jbang [script.java]```

**Create new script**

```jbang init [script.java]```

**Run with dependencies**

```jbang [script.java]```

**Edit in IDE**

```jbang edit [script.java]```

**Install as command**

```jbang app install [script.java]```

**Run from URL**

```jbang [https://example.com/script.java]```

# SYNOPSIS

**jbang** [_options_] _command_ [_args_]

# PARAMETERS

**init** _FILE_
> Create new script.

**run** _FILE_
> Run script (default).

**edit** _FILE_
> Open in IDE.

**app install** _FILE_
> Install script as app.

**--deps** _GAV_
> Add Maven dependencies.

**--java** _VERSION_
> Use specific Java version.

**--help**
> Display help information.

# DESCRIPTION

**jbang** runs Java programs as scripts without build tools. It handles dependencies, compilation, and execution automatically.

The tool supports inline dependency declarations using comments. It enables shell-script style Java programming.

# CAVEATS

Requires Java. Dependency download on first run. Scripts use comment directives.

# HISTORY

jbang was created by **Max Rydahl Andersen** to make Java scripting as easy as Python or Bash scripts.

# SEE ALSO

[java](/man/java)(1), [javac](/man/javac)(1), [groovy](/man/groovy)(1), [kotlin](/man/kotlin)(1)
