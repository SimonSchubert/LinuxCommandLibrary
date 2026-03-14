# TAGLINE

Display Perl documentation

# TLDR

**View module documentation**

```perldoc [Module::Name]```

**Look up a built-in function**

```perldoc -f [function_name]```

**Search the FAQ for a keyword**

```perldoc -q "[keyword]"```

**Look up a built-in variable**

```perldoc -v '[variable]'```

**View a module's source code**

```perldoc -m [Module::Name]```

**Display documentation as plain text** (no formatting)

```perldoc -t [Module::Name]```

**View the Perl tutorial**

```perldoc perlintro```

# SYNOPSIS

**perldoc** [_options_] [_PageName_|_ModuleName_|_ProgramName_|_URL_]

# PARAMETERS

_TOPIC_
> Module name, program name, or documentation page to display.

**-f** _FUNCTION_
> Look up a built-in Perl function by name.

**-q** _QUERY_
> Search the Perl FAQ (perlfaq) for entries matching a regex.

**-v** _VARIABLE_
> Look up a built-in Perl variable (e.g., -v '$!').

**-m** _MODULE_
> Display the module source code rather than its documentation.

**-t**
> Plain text output (no man-page formatting).

**-T**
> Send output to STDOUT without a pager.

**-l**
> Display the file path of the module instead of its documentation.

**-U**
> Run in unsafe mode to allow running perldoc as root.

# DESCRIPTION

**perldoc** is the standard Perl documentation viewer. It looks up and displays documentation written in POD (Plain Old Documentation) format embedded in Perl modules, scripts, and core documentation pages. When invoked with a module name, it searches **@INC** paths to find and render the module's POD. Without arguments, it displays its own usage.

Common documentation pages include **perlintro** (tutorial), **perlfunc** (built-in functions), **perlvar** (special variables), **perlre** (regular expressions), and **perlop** (operators).

# CAVEATS

Documentation is only available for installed modules. Uses the system pager (usually **less** or **more**) for display. The **-v** flag requires quoting the variable to prevent shell interpolation.

# HISTORY

**perldoc** has been part of the core Perl distribution since **Perl 5.004** (1997). It replaced the need to manually search for and format POD documentation.

# SEE ALSO

[perl](/man/perl)(1), [pod2man](/man/pod2man)(1), [pod2html](/man/pod2html)(1)
