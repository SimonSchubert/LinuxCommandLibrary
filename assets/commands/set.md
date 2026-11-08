# TAGLINE

Set shell options and positional parameters

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

**Show the state of all options**

```set -o```

**Enable an option by its long name**

```set -o [noclobber]```

# SYNOPSIS

**set** [**-abefhkmnptuvxBCEHPT**] [**-o** _option-name_] [**--**] [**-**] [_arg_...]

**set** [**+abefhkmnptuvxBCEHPT**] [**+o** _option-name_] [**--**] [**-**] [_arg_...]

**set** **-o**

**set** **+o**

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
> Pipeline returns the status of the rightmost command that exited non-zero, or zero if all succeeded

**-o posix**
> Change behavior to match the POSIX standard where the default differs

**-o vi**, **-o emacs**
> Select the command-line editing style

**-o history**
> Enable command history (default on in interactive shells)

**-o ignoreeof**
> Do not exit an interactive shell on EOF

**-o**
> Without an argument, print the current option settings

**+o**
> Without an argument, print **set** commands that recreate the current settings

**--**
> End of options; remaining args become positional parameters. With no args, positional parameters are unset

**-**
> End of options; turns off **-x** and **-v**. With no args, positional parameters are unchanged

# DESCRIPTION

**set** is a shell builtin that controls shell options and positional parameters. Options modify shell behavior for scripting, debugging, and interactive use. Use **-** to enable an option and **+** to disable it.

When invoked without arguments, **set** displays all shell variables and functions. With **--** followed by arguments, it sets the positional parameters (**$1**, **$2**, etc.) to the provided values.

The combination **set -euo pipefail** is a common "strict mode" for shell scripts that causes immediate exit on errors, undefined variable references, or pipeline failures, catching bugs early and preventing silent failures.

# CAVEATS

The **-u** option does not apply to **$@** and other whole-list expansions of the positional parameters. The **-e** option has many exceptions: it does not trigger exit for commands in **if** tests, **while**/**until** conditions, commands negated with **!**, any command in a **&&** or **||** list except the last, or any command in a pipeline except the last (subject to **pipefail**). It is also ignored throughout a function or compound command running in one of these contexts. Understanding these exceptions is important for reliable error handling in scripts.

# HISTORY

The **set** command is part of the Bourne shell, written by **Stephen Bourne** at Bell Labs and released with Version 7 Unix in **1979**. It was standardized by POSIX and extended in bash with additional options. **pipefail** arrived in bash 3.0 and was added to POSIX in the 2024 edition.

# SEE ALSO

[bash](/man/bash)(1), [sh](/man/sh)(1), [shopt](/man/shopt)(1), [unset](/man/unset)(1), [export](/man/export)(1)

# RESOURCES

```[Homepage](https://www.gnu.org/software/bash/)```

```[Documentation](https://www.gnu.org/software/bash/manual/bash.html)```

<!-- verified: 2026-11-08 -->
