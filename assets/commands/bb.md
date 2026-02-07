# TAGLINE

Native Clojure interpreter for scripting

# TLDR

**Build** Clojure project

```bb [script.clj]```

**Run** REPL

```bb repl```

**Execute** expression

```bb -e ["(println (+ 1 2 3))"]```

**Install** task runner

```bb tasks```

# SYNOPSIS

**bb** [_options_] [_file_] [_args_]

# DESCRIPTION

**bb** (Babashka) is a native Clojure interpreter for scripting. It provides fast startup times and can run Clojure scripts without JVM overhead, making it suitable for shell scripting and task automation.

The tool enables using Clojure for tasks typically handled by bash or Python scripts.

# PARAMETERS

**-e**, **--eval** _expr_
> Evaluate expression

**-f**, **--file** _file_
> Run file

**-m**, **--main** _ns_
> Call main function in namespace

**--repl**
> Start REPL

**--nrepl-server**
> Start nREPL server

**--classpath** _cp_
> Set classpath

**--uberscript** _file_
> Create standalone script

# FEATURES

- Fast startup (milliseconds)
- Most of Clojure core
- Common libraries included
- Task runner (bb.edn)
- Pod system for native bindings
- Compatible with Clojure syntax
- Shell out capabilities

# TASK RUNNER

Define tasks in bb.edn:
```clojure
{:tasks
 {test {:doc "Run tests"
        :task (shell "clojure -M:test")}}}
```

# CONFIGURATION

**bb.edn**
> Project configuration file for tasks, dependencies, and classpath settings.

# CAVEATS

Not full Clojure (some features missing). Not as fast as compiled code. Limited Java interop. Some libraries don't work. Pods add complexity.

# HISTORY

**Babashka** was created by Michiel Borkent in **2019** to enable fast Clojure scripting without JVM startup overhead.

# SEE ALSO

[clojure](/man/clojure)(1), [lein](/man/lein)(1), [janet](/man/janet)(1)
