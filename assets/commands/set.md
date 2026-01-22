# TLDR

**Enable strict mode** (exit on error, undefined variables, pipeline failures)

```set -euo pipefail```

**Exit immediately** if any command returns non-zero status

```set -e```

**Treat unset variables** as errors

```set -u```

**Print commands** before execution (debugging)

```set -x```

**Disable an option** (use + instead of -)

```set +x```

**Disable filename expansion** (globbing)

```set -f```

**List all shell variables** and functions

```set```

**Set positional parameters**

```set -- [arg1] [arg2] [arg3]```

# SYNOPSIS

**set** [**-abefhkmnptuvxBCEHPT**] [**-o** _option-name_] [**--**] [_arg_...]

# PARAMETERS

**-a** (**allexport**)
> Export all created or modified variables and functions

**-b** (**notify**)
> Report terminated background job status immediately

**-e** (**errexit**)
> Exit immediately if a command returns non-zero status

**-f** (**noglob**)
> Disable filename expansion (globbing)

**-h** (**hashall**)
> Remember command locations as they are looked up

**-k** (**keyword**)
> Place all assignment arguments in the environment

**-m** (**monitor**)
> Enable job control

**-n** (**noexec**)
> Read commands but do not execute them (syntax check)

**-p** (**privileged**)
> Enable privileged mode

**-t** (**onecmd**)
> Exit after reading and executing one command

**-u** (**nounset**)
> Treat unset variables as an error during expansion

**-v** (**verbose**)
> Print shell input lines as they are read

**-x** (**xtrace**)
> Print commands and arguments before execution

**-B** (**braceexpand**)
> Enable brace expansion (default on)

**-C** (**noclobber**)
> Prevent overwriting files with output redirection

**-E** (**errtrace**)
> ERR trap is inherited by shell functions and subshells

**-H** (**histexpand**)
> Enable ! style history substitution

**-P** (**physical**)
> Do not resolve symbolic links for commands like cd

**-T** (**functrace**)
> DEBUG and RETURN traps inherited by functions

**-o pipefail**
> Pipeline returns status of last non-zero command

**--**
> End of options; remaining args become positional parameters

# DESCRIPTION

**set** is a shell builtin that controls shell options and positional parameters. Options modify shell behavior for scripting, debugging, and interactive use. Use **-** to enable an option and **+** to disable it.

When invoked without arguments, **set** displays all shell variables and functions. With **--** followed by arguments, it sets the positional parameters (**$1**, **$2**, etc.) to the provided values.

The combination **set -euo pipefail** is a common "strict mode" for shell scripts that causes immediate exit on errors, undefined variable references, or pipeline failures—catching bugs early and preventing silent failures.

# CAVEATS

The **-e** option has many exceptions: it does not trigger exit for commands in **if** tests, **while**/**until** conditions, commands negated with **!**, or the left side of **&&** and **||**. Understanding these exceptions is important for reliable error handling in scripts.

# HISTORY

The **set** command has been part of the Bourne shell since its creation by **Stephen Bourne** at Bell Labs in **1979**. It was included in POSIX and extended in bash with additional options like **pipefail**. The concept of shell options predates even the Bourne shell, with roots in early Unix shells.

# SEE ALSO

[bash](/man/bash)(1), [sh](/man/sh)(1), [shopt](/man/shopt)(1), [unset](/man/unset)(1), [export](/man/export)(1)
