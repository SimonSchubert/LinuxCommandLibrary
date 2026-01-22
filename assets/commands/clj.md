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

**clj** is the Clojure CLI for running REPLs and programs. Manages dependencies via deps.edn. Includes rlwrap for line editing in REPL. Use `clojure` for non-interactive execution.

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

# CAVEATS

Requires deps.edn for project configuration. Use `clojure` instead of `clj` in scripts (no rlwrap). JVM options via -J or JAVA_OPTS env var.

# SEE ALSO

[lein](/man/lein)(1), [java](/man/java)(1), [clojure](/man/clojure)(1)
