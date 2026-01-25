# TLDR

**Install Quicklisp**

```curl -O https://beta.quicklisp.org/quicklisp.lisp && sbcl --load quicklisp.lisp```

**Load a system**

```(ql:quickload "system-name")```

**Search for systems**

```(ql:system-apropos "keyword")```

**Update Quicklisp**

```(ql:update-client)```

# SYNOPSIS

Quicklisp Common Lisp library manager

# DESCRIPTION

**Quicklisp** is a library manager for Common Lisp. It downloads, installs, and loads libraries and their dependencies automatically. It works with most Common Lisp implementations.

# INSTALLATION

```lisp
; Download and load installer
(load "quicklisp.lisp")

; Install to default location
(quicklisp-quickstart:install)

; Add to init file
(ql:add-to-init-file)
```

# EXAMPLES

```lisp
; Load a library
(ql:quickload "cl-ppcre")

; Load multiple
(ql:quickload '("alexandria" "cl-json"))

; Search for libraries
(ql:system-apropos "http")

; Update dist
(ql:update-dist "quicklisp")

; Update client
(ql:update-client)

; List installed
(ql:system-list)
```

# COMMON LIBRARIES

```
alexandria     - Utility functions
cl-ppcre       - Regular expressions
drakma         - HTTP client
cl-json        - JSON parsing
hunchentoot    - Web server
```

# CAVEATS

Requires Common Lisp implementation (SBCL, CCL, etc.). Libraries installed to ~/quicklisp/ by default.

# HISTORY

Quicklisp was created by **Zach Beane** in 2010 to simplify Common Lisp library management.

# SEE ALSO

[sbcl](/man/sbcl)(1), [clisp](/man/clisp)(1), [asdf](/man/asdf)(1)
