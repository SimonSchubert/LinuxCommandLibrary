# TAGLINE

Clojure CLI with readline support

# TLDR

**Start REPL**

```clj```

**Run script file**

```clj -M [script.clj]```

**Execute function**

```clj -X [namespace/function]```

**Add dependency alias**

```clj -A:[alias]```

**List dependencies**

```clj -X:deps list```

**Show dependency tree**

```clj -X:deps tree```

**Run with extra JVM options**

```clj -J-Xmx[2g] -M [script.clj]```

# SYNOPSIS

**clj** [_clj-opts_] [_-M_|_-X_|_-T_] [_aliases_] [_args_]

# DESCRIPTION

**clj** is a wrapper around the **clojure** command that adds readline support via **rlwrap**, providing line editing, history, and completion in the REPL. It is the recommended way to start interactive Clojure development sessions.

The tool manages dependencies through **deps.edn** configuration files and supports multiple execution modes for running programs, executing functions, and invoking tools. Aliases defined in deps.edn allow switching between different dependency configurations for development, testing, and production.

For non-interactive use cases such as shell scripts and CI pipelines, use the **clojure** command directly instead, as rlwrap can interfere with piped input and output.

# EXECUTION MODES

**-M**
> Use clojure.main, call -main function

**-X**
> Execute function with keyword args map

**-T**
> Like -X but classpath set to . only

# PARAMETERS

**-A**:_aliases_
> Use aliases for deps/paths

**-J** _opt_
> Pass option to JVM

**-Sdeps** _edn_
> Override deps.edn

**-Spath**
> Print classpath

**-Scp** _cp_
> Use given classpath

**-Sforce**
> Force classpath recomputation

**-Srepro**
> Ignore user deps.edn

**-Stree**
> Print dependency tree

**-Sdescribe**
> Print environment info as EDN

**-P**
> Prepare deps only, don't exec

**-h**, **--help**
> Show help

# BUILT-IN TOOLS

```
clj -X:deps list       # List all deps
clj -X:deps tree       # Dependency tree
clj -X:deps mvn-pom    # Generate pom.xml
```

# CONFIGURATION

**deps.edn**
> Project-level dependency declarations, aliases, and path configurations.

**~/.clojure/deps.edn**
> User-level default dependencies and aliases applied to all projects.

# CAVEATS

Requires deps.edn for project configuration. Use `clojure` instead of `clj` in scripts (no rlwrap). JVM options via -J or JAVA_OPTS env var.

# SEE ALSO

[lein](/man/lein)(1), [java](/man/java)(1), [clojure](/man/clojure)(1)
