# TAGLINE

Generate open source license files

# TLDR

**List licenses**

```license list```

**Generate MIT license**

```license mit```

**Generate Apache license**

```license apache-2.0```

**Generate GPL license**

```license gpl-3.0```

**Generate and redirect to file**

```license mit > LICENSE```

**With author name and year**

```license -n "[Your Name]" -y [2025] mit```

**Save license to a file**

```license -o LICENSE.txt mit```

# SYNOPSIS

**license** [_command_] [_options_]

# PARAMETERS

_LICENSE_
> License type to generate (e.g., mit, apache-2.0, gpl-3.0, bsd-2-clause, isc, mpl-2.0, unlicense).

**list**
> List all available license types.

**-n**, **-name** _NAME_
> Author name for the license. Falls back to LICENSE_FULL_NAME env var, then git config.

**-y**, **-year** _YEAR_
> Year for copyright notice. Defaults to the current year.

**-o** _FILE_
> Save the license to the specified file instead of stdout.

**-help**
> Display help information.

# DESCRIPTION

**license** generates open source license files from the command line. It supports all license types listed on the GitHub Licenses API and more, including MIT, Apache-2.0, GPL-3.0, BSD-2-Clause, ISC, MPL-2.0, and Unlicense.

The tool outputs license text to stdout by default. Use **-o** to save directly to a file. Author name is resolved from command-line flags, the **LICENSE_FULL_NAME** environment variable, or git/hg config.

# CAVEATS

Multiple implementations of license generators exist (nishanths/license, azu/license-generator, etc.) with different flag conventions. This page documents **nishanths/license**, written in Go. Check which tool is installed with **license -help**.

# HISTORY

**license** (nishanths/license) was created by **Nishanth Shanmugham** and is written in **Go**.

# SEE ALSO

[licensor](/man/licensor)(1), [git](/man/git)(1)

