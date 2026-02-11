# TAGLINE

Tcl scripting language shell

# TLDR

**Start an interactive Tcl shell**

```tclsh```

**Run a Tcl script**

```tclsh [script.tcl]```

**Run a script with arguments**

```tclsh [script.tcl] [arg1] [arg2]```

**Run in interactive mode** after executing a script

```tclsh -i [script.tcl]```

**Specify encoding** for reading the script

```tclsh -encoding utf-8 [script.tcl]```

**Execute a Tcl command** directly

```echo 'puts "Hello World"' | tclsh```

# SYNOPSIS

**tclsh** [_-encoding name_] [_-i_] [_-norc_] [_--_] [_filename_] [_arg ..._]

# PARAMETERS

**-encoding** _name_
> Specify the character encoding for reading the script file (e.g., utf-8).

**-i**
> Force interactive mode even when a script file is provided.

**-f**
> Force the first non-option argument to be treated as a script file.

**-norc**
> Do not load the user's startup file (~/.tclshrc).

**-t**
> Equivalent to **-i**, forces interactive mode.

**--**
> End of options; all following arguments are the script file and its arguments.

# DESCRIPTION

**tclsh** is the standard shell for the Tcl (Tool Command Language) scripting language. It reads and evaluates Tcl commands from standard input or from a script file. When invoked without arguments, it runs interactively with a **%** prompt.

Several variables are set for scripts: **argc** contains the argument count, **argv** is a list of arguments, **argv0** is the script name, and **tcl_interactive** indicates whether the shell is interactive.

In interactive mode, the shell reads the **~/.tclshrc** startup file before accepting commands. The prompts can be customized via **tcl_prompt1** and **tcl_prompt2** variables.

# CAVEATS

Tcl uses different syntax than most Unix shells. Braces **{}** are used for grouping, brackets **[]** for command substitution, and **$** for variable expansion. String quoting and list handling follow Tcl conventions rather than POSIX shell conventions.

# HISTORY

Tcl was created by **John Ousterhout** at UC Berkeley in **1988** as an embeddable scripting language. The name stands for "Tool Command Language". Tcl gained popularity with the Tk GUI toolkit. Development continued at Sun Microsystems in the 1990s and is now maintained by the Tcl Core Team. The current major version is Tcl 8.6, with Tcl 9.0 in development.

# SEE ALSO

[wish](/man/wish)(1), [expect](/man/expect)(1), [bash](/man/bash)(1), [python](/man/python)(1)
