# TAGLINE

The Raku programming language interpreter

# TLDR

**Start an interactive REPL** session

```raku```

**Execute a Raku script**

```raku [path/to/script.raku]```

**Run a one-liner** program

```raku -e 'say "Hello, World!"'```

**Check the syntax** of a script without executing it

```raku -c [path/to/script.raku]```

**Run a program for each line** of input (like awk/sed)

```cat [path/to/file] | raku -ne 'say .uc'```

**Run a one-liner** that also prints each line after processing

```cat [path/to/file] | raku -pe '.=uc'```

**Add a module search path** and load a module before execution

```raku -I [lib] -M [MyModule] [path/to/script.raku]```

**Extract and display inline Pod documentation**

```raku --doc [path/to/script.raku]```

# SYNOPSIS

**raku** [_switches_] [**--**] [_programfile_] [_arguments_]

# PARAMETERS

**-c**
> Check syntax only (runs BEGIN and CHECK blocks but does not execute the program).

**-e** _program_
> Execute one line of program. Strict mode is enabled by default.

**-n**
> Run the program once for each line of input.

**-p**
> Same as **-n**, but also prints **$_** at the end of each line.

**-I** _path_
> Add _path_ to the module search path.

**-M** _module_
> Load _module_ before running the program.

**-o**, **--output** _name_
> Specify the name of the output file for compilation.

**-h**, **--help**
> Display help text.

**-v**, **--version**
> Display version information.

**-V**
> Print configuration summary.

**--doc**[=_module_]
> Extract inline Pod documentation and print as text. Optionally use **Pod::To::**_module_ to render (e.g. **--doc=HTML**).

**--target** _stage_
> Specify the compilation stage to emit (parse, ast, mast, mbc).

**--optimize** _level_
> Set optimization level (0 to 3).

**--rakudo-home** _path_
> Override the path to Rakudo runtime files.

**--stagestats**
> Display time spent in each compilation stage.

**--ll-exception**
> Display a low-level backtrace on errors.

**--profile**[=_name_]
> Write profile information to a file. Format determined by extension (.json, .sql, or .html).

**--profile-compile**[=_name_]
> Write compile-time profile information to a file.

**--full-cleanup**
> Try to free all memory and exit cleanly.

**--debug-port** _port_
> Listen for incoming debugger connections on _port_.

**--debug-suspend**
> Pause execution at the entry point.

# DESCRIPTION

**raku** is the interpreter for the **Raku** programming language (formerly known as Perl 6). Raku is a multi-paradigm language supporting procedural, object-oriented, functional, and concurrent programming. It features gradual typing, powerful pattern matching with grammars, built-in concurrency primitives, and Unicode support throughout.

When invoked without arguments, raku starts an interactive REPL (Read-Eval-Print Loop). With a program file or the **-e** option, it compiles and executes the given code. The **-n** and **-p** flags provide awk/sed-like one-liner capabilities for processing input line by line.

The interpreter is implemented by **Rakudo**, the primary Raku compiler, which targets the MoarVM virtual machine (and optionally JVM). Raku scripts conventionally use the **.raku** file extension (previously **.p6** or **.pl6**).

# CAVEATS

Startup time can be noticeably slower than Perl 5 or Python due to compilation overhead. The **-c** flag runs BEGIN and CHECK blocks, so syntax checking is not entirely side-effect-free. Module ecosystem is smaller than Perl 5's CPAN. The **--profile** option can generate very large output files for long-running programs.

# HISTORY

Raku began as **Perl 6**, announced by **Larry Wall** in **2000** as a complete redesign of the Perl language. After nearly two decades of development, the first stable release (**Rakudo Star 2015.12**) shipped in **December 2015**. In **October 2019**, the language was officially renamed from Perl 6 to **Raku** to establish its own identity separate from Perl 5. The primary implementation is **Rakudo**, running on the **MoarVM** virtual machine.

# SEE ALSO

[perl](/man/perl)(1), [python](/man/python)(1), [ruby](/man/ruby)(1)
