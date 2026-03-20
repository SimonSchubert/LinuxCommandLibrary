# TAGLINE

computer algebra system for symbolic mathematics

# TLDR

**Start Maxima**

```maxima```

**Evaluate expression**

```maxima --batch-string="[expand((x+1)^3)];"```

**Run script file**

```maxima -b [script.mac]```

**Use quiet mode**

```maxima -q```

**Start with wxMaxima interface**

```wxmaxima```

# SYNOPSIS

**maxima** [_options_]

# PARAMETERS

**-b**, **--batch** _file_
> Process maxima file in batch mode.

**--batch-string** _string_
> Process maxima command(s) in batch mode.

**--batch-lisp** _file_
> Process Lisp file in batch mode.

**-q**, **--quiet**
> Suppress Maxima start-up message.

**--very-quiet**
> Suppress expression labels and start-up message.

**-l** _lisp_
> Specify Lisp implementation (e.g., sbcl, clisp, gcl).

**--init** _file_
> Initialization file.

**-p** _file_
> Preload Lisp file.

**-d**, **--directories**
> Display Maxima internal directory information.

**-s** _port_, **--server** _port_
> Connect Maxima to server on specified port.

**-v**, **--verbose**
> Display Lisp invocation in maxima wrapper script.

**--version**
> Display the installed version.

# DESCRIPTION

**Maxima** is a computer algebra system for symbolic mathematics. It can perform symbolic differentiation, integration, Taylor series, transforms, linear algebra, and more.

Maxima is descended from Macsyma, one of the oldest computer algebra systems.
# CAVEATS

Syntax differs from other CAS. Output formatting can be complex. GUI (wxMaxima) recommended for interactive use.

# HISTORY

Maxima descends from **Macsyma** developed at **MIT** starting in **1968**. The DOE version was released as open source in **1998** and became Maxima.

# SEE ALSO

[octave](/man/octave)(1)
