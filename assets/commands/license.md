# TAGLINE

generates open source license files

# TLDR

**List licenses**

```license list```

**Generate MIT license**

```license mit```

**Generate Apache license**

```license apache-2.0```

**Generate GPL license**

```license gpl-3.0```

**Save to file**

```license mit > LICENSE```

**With author name**

```license mit --name "[Your Name]"```

# SYNOPSIS

**license** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> License type or subcommand.

**list**
> List available licenses.

**--name** _NAME_
> Author name for license.

**--year** _YEAR_
> Year for copyright.

**--help**
> Display help information.

# DESCRIPTION

**license** generates open source license files. It supports common licenses like MIT, Apache, GPL, and BSD.

The tool outputs license text to stdout. Redirect to create LICENSE files for projects.

# CAVEATS

Multiple implementations exist. Check your specific tool's options. Some require configuration.

# HISTORY

Various license generators exist as command-line tools, automating the process of adding proper licensing to open source projects.

# SEE ALSO

[licensor](/man/licensor)(1), [git](/man/git)(1)

