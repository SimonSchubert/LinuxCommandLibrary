# TAGLINE

Steel Bank Common Lisp compiler and runtime

# TLDR

**Start REPL**

```sbcl```

**Run a Lisp script**

```sbcl --script [script.lisp]```

**Load file and start REPL**

```sbcl --load [file.lisp]```

**Evaluate expression and exit**

```sbcl --eval "(print 'hello)" --quit```

**Compile to executable**

```sbcl --eval "(load \"app.lisp\")" --eval "(sb-ext:save-lisp-and-die \"app\" :executable t)"```

**Run with specific core**

```sbcl --core [custom.core]```

**Disable debugger** (for scripts)

```sbcl --disable-debugger --load [script.lisp]```

**Load ASDF system**

```sbcl --eval "(asdf:load-system :system-name)"```

# SYNOPSIS

**sbcl** [_--script file_] [_--load file_] [_--eval expr_] [_--quit_] [_options_]

# PARAMETERS

**--script** _FILE_
> Run script (no REPL, --disable-debugger implied).

**--load** _FILE_
> Load Lisp file.

**--eval** _EXPR_
> Evaluate expression.

**--quit**
> Exit after processing.

**--core** _CORE_
> Use specified core file.

**--disable-debugger**
> Disable Lisp debugger.

**--noinform**
> Suppress startup banner.

**--noprint**
> Disable REPL printing.

**--non-interactive**
> Non-interactive mode.

**--userinit** _FILE_
> User init file (default: ~/.sbclrc).

**--no-userinit**
> Skip user init file.

**--sysinit** _FILE_
> System init file.

**--no-sysinit**
> Skip system init file.

**--dynamic-space-size** _MB_
> Heap size in megabytes.

**--control-stack-size** _MB_
> Stack size in megabytes.

# DESCRIPTION

**SBCL** (Steel Bank Common Lisp) is a high-performance Common Lisp compiler. It compiles to native code with sophisticated optimizations, making it one of the fastest Lisp implementations.

The REPL (Read-Eval-Print Loop) provides interactive development. Code can be loaded, tested, and modified without restarting. The debugger offers restarts, backtraces, and inspection.

ASDF (Another System Definition Facility) manages projects and dependencies. Quicklisp provides a package manager for Common Lisp libraries. Together they enable modern project development.

Creating executables uses sb-ext:save-lisp-and-die, dumping an image including loaded code. The result is a standalone executable with fast startup.

SBCL includes the SB-* extension packages: threading (sb-thread), networking (sb-bsd-sockets), FFI (sb-alien), and more. These extend standard Common Lisp.

The type system enables optional type declarations for optimization. The compiler provides detailed notes about optimization opportunities.

# CONFIGURATION

**~/.sbclrc**
> User initialization file loaded at startup, commonly used to configure Quicklisp, set optimization policies, and define startup behavior.

**/etc/sbclrc**
> System-wide initialization file loaded before the user init file.

# CAVEATS

Core files are large (50MB+). Compilation can be memory-intensive. Some POSIX signal handling differs from other implementations. Threading model may differ across platforms. Not all CL libraries support all platforms.

# HISTORY

**SBCL** was forked from **CMUCL** (Carnegie Mellon University Common Lisp) in **1999** by a group of developers seeking more active maintenance. The name "Steel Bank" plays on "Carnegie" (Andrew Carnegie was a steel baron). It has become one of the most popular free Common Lisp implementations, known for its performance and active development.

# SEE ALSO

[clisp](/man/clisp)(1), [ecl](/man/ecl)(1), [quicklisp](/man/quicklisp)(1), [roswell](/man/roswell)(1)
