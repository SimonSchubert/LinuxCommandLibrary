# TAGLINE

Common Lisp implementation manager

# TLDR

**Install Roswell**

```ros setup```

**Install Common Lisp implementation**

```ros install [sbcl]```

**Run Lisp REPL**

```ros run```

**Run script**

```ros [script.ros]```

**Install Quicklisp system**

```ros install [system-name]```

# SYNOPSIS

**ros** [_options_] [_command_] [_args_]

# PARAMETERS

**setup**
> Initial setup.

**install** _impl_
> Install implementation.

**run**
> Start REPL.

**use** _impl_
> Switch implementation.

**list**
> List available.

**init** _name_
> Create script template.

# DESCRIPTION

**Roswell** is a Common Lisp implementation manager and launcher. It handles installation of different Lisp implementations, manages Quicklisp, and provides script execution.

# EXAMPLES

```bash
# Initial setup
ros setup

# Install SBCL
ros install sbcl

# Install CCL
ros install ccl-bin

# List installed
ros list installed

# Start REPL with specific impl
ros use sbcl
ros run

# Create script
ros init my-script

# Run script
ros my-script.ros

# Install library
ros install alexandria
```

# SCRIPT FORMAT

```lisp
#!/bin/sh
#|-*- mode:lisp -*-|#
#|
exec ros -Q -- $0 "$@"
|#

(defun main (&rest args)
  (format t "Hello, World!~%"))
```

# CAVEATS

Requires initial setup. Downloads implementations. Scripts are portable across implementations.

# HISTORY

Roswell was created by **Masatoshi Sano** to simplify Common Lisp development environment management.

# SEE ALSO

[sbcl](/man/sbcl)(1), [quicklisp](/man/quicklisp)(1), [clisp](/man/clisp)(1)
