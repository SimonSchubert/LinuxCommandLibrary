# TLDR

**Create new project**

```lein new [template] [project-name]```

**Run project**

```lein run```

**Start REPL**

```lein repl```

**Run tests**

```lein test```

**Build JAR**

```lein jar```

**Build uberjar**

```lein uberjar```

**Install dependencies**

```lein deps```

# SYNOPSIS

**lein** _task_ [_options_]

# PARAMETERS

**new** _TEMPLATE_ _NAME_
> Create project.

**run**
> Run main function.

**repl**
> Start REPL.

**test**
> Run tests.

**jar**
> Build JAR.

**uberjar**
> Build standalone JAR.

**deps**
> Download dependencies.

**--help**
> Display help information.

# DESCRIPTION

**Leiningen** is the Clojure build tool. It manages projects, dependencies, and builds.

The tool provides templates for project creation. It integrates with Maven repositories.

lein manages Clojure projects.

# CAVEATS

Requires Java. project.clj configuration. Consider deps.edn for newer projects.

# HISTORY

Leiningen was created by **Phil Hagelberg** as the standard build tool for Clojure projects.

# SEE ALSO

[clojure](/man/clojure)(1), [java](/man/java)(1), [boot](/man/boot)(1)
