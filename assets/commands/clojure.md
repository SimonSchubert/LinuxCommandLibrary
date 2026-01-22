# TLDR

**Start a Clojure REPL**

```clojure```

**Run a Clojure script**

```clojure -M [script.clj]```

**Execute a specific function**

```clojure -X [namespace/function]```

**Run with additional dependencies**

```clojure -Sdeps '{:deps {org.clojure/data.json {:mvn/version "2.4.0"}}}'```

**Start a REPL with a specific alias** from deps.edn

```clojure -A:[alias]```

**Evaluate an expression**

```clojure -M -e '(println "Hello, World!")'```

**Build an uberjar** using tools.build

```clojure -T:build uber```

**Show classpath** without running

```clojure -Spath```

# SYNOPSIS

**clojure** [_dep-opts_] [_init-opts_] [_main-opts_] [_args_]

# PARAMETERS

**-M** [_:aliases_]
> Use concatenated aliases for running main entry point.

**-X** [_:aliases_]
> Execute a function with exec arguments.

**-T** [_:aliases_]
> Execute tool with exec arguments.

**-A** [_:aliases_]
> Use concatenated aliases for REPL.

**-Sdeps** _EDN_
> Additional dependencies in EDN format.

**-Spath**
> Print the classpath and exit.

**-Stree**
> Print the dependency tree.

**-Sdescribe**
> Print environment and command info.

**-e**, **--eval** _STRING_
> Evaluate the given expression.

**-r**, **--repl**
> Run a REPL.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**clojure** is the official command-line launcher for the Clojure programming language. It manages dependencies through **deps.edn** configuration files and provides a streamlined workflow for REPL-driven development, script execution, and building applications.

The CLI integrates with Maven and Git repositories for dependency resolution, automatically downloading and caching libraries as needed. Aliases in deps.edn allow defining different configurations for development, testing, and production environments.

Clojure provides three main execution modes: **-M** for traditional main function execution, **-X** for executing functions with keyword arguments, and **-T** for tool invocation. The REPL supports interactive development with immediate feedback, a core practice in Clojure development.

# CAVEATS

Requires Java Runtime Environment (JRE) version 8 or higher. Initial dependency downloads can take time but are cached locally. The CLI requires a deps.edn file for project-specific configurations; global defaults apply without one.

# HISTORY

Clojure was created by Rich Hickey and released in **2007** as a modern Lisp for the JVM. The **clojure** CLI and deps.edn tooling were introduced in **2018** as an official alternative to Leiningen and Boot, providing a simpler, more composable approach to dependency management.

# SEE ALSO

[lein](/man/lein)(1), [java](/man/java)(1), [clj](/man/clj)(1)
