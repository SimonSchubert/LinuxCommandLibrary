# TAGLINE

Set zsh shell emulation mode

# TLDR

**Print** the current emulation mode

```emulate```

**Switch** to native zsh emulation

```emulate zsh```

**Emulate** Bourne shell (sh) behavior

```emulate sh```

**Emulate** Korn shell (ksh) behavior

```emulate ksh```

**Reset** all options to defaults for the chosen mode

```emulate -R [zsh|sh|ksh|csh]```

**Restrict** emulation effects to the surrounding function

```emulate -L [sh]```

**Run** a command under a temporary emulation

```emulate [sh] -c '[command]'```

**List** the options that would be set for a given mode

```emulate -lR [ksh]```

# SYNOPSIS

**emulate** [**-lLR**] [{**-M** | **-S**}] [**-c** _arg_] [_mode_]

# PARAMETERS

**-L**
> Set **LOCAL_OPTIONS**, **LOCAL_PATTERNS**, and **LOCAL_TRAPS** so that the emulation, option changes, and traps revert when the surrounding function returns. Implies a function context.

**-R**
> Reset every settable option to its default value for the requested emulation, except for options describing the interactive environment (e.g. **ZLE**, **HIST**\_ flags). Without **-R**, only options that differ between modes are touched.

**-l**
> List the options and their values that the current invocation would set, instead of changing the shell state. Combine with **-L** or **-R** to scope the listing.

**-c**  _arg_
> Evaluate _arg_ in the requested emulation, then restore the previous mode and options. Functions defined inside _arg_ become **sticky**, retaining the temporary emulation when later invoked.

**-M**
> When defining a function inside **-c**, ignore any sticky emulation already attached to the calling context (use the matching one).

**-S**
> Counterpart to **-M**: force the new function to inherit the current sticky emulation regardless of how it was reached.

_mode_
> One of **zsh**, **sh**, **ksh**, or **csh**. With no argument, **emulate** prints the active mode.

# DESCRIPTION

**emulate** is a zsh builtin that switches the shell into a compatibility mode resembling another Bourne-family shell. Each mode adjusts a curated set of options governing word splitting, glob behavior, function handling, prompt expansion, and parameter rules so that scripts written for **sh**, **ksh**, or **csh** behave more predictably under zsh.

The change applies to the running shell unless **-L** scopes it to a function. With **-R**, every settable option is forced to the canonical defaults for the target mode—useful at the top of a script that should run in a clean, predictable environment regardless of the user's interactive setup.

The **-c** form is the safest way to borrow another mode for a snippet: the previous emulation, options, and traps are restored on exit. Functions defined while **-c** is active acquire sticky emulation, so they continue to evaluate under that mode no matter where they are later called from. This is the mechanism behind the autoloaded **zsh/system** completion functions.

Querying with no arguments returns the current top-level emulation, which can be tested in scripts to gate behavior. Combining **-l** with **-R** prints exactly which options would be toggled, making it convenient for inspecting the differences between modes without applying them.

# EMULATION MODES

**zsh**
> Native mode. All zsh extensions are available; the shell behaves as documented in **zshall**(1).

**sh**
> POSIX/Bourne-style behavior. Disables many zsh-only features (e.g., implicit globbing failure, **EQUALS** expansion) and enables compatibility flags such as **SH_WORD_SPLIT**.

**ksh**
> Korn-shell compatibility. Enables **KSH_ARRAYS**, **KSH_GLOB**, **KSH_OPTION_PRINT**, and related options used by ksh-style scripts.

**csh**
> C-shell compatibility. Enables **CSH_JUNKIE_LOOPS**, **CSH_NULL_GLOB**, and similar options. Less complete than the others—csh syntax is not fully implemented.

# CAVEATS

**emulate** changes options, not parser syntax: zsh still parses zsh syntax even under **emulate sh**, so constructs like `=(...)` or `<(...)` remain available unless explicitly disabled. To run an actual sh script, invoke **sh** as a separate process. **emulate** without **-L** has global effect—if used at the top level of an interactive shell, it persists for the rest of the session. Sticky emulations attached via **-c** survive **typeset -f** copying, so two functions with identical bodies may behave differently.

# HISTORY

The **emulate** builtin has been part of zsh since the early **1990s**, introduced to ease the porting of ksh and Bourne shell scripts as zsh's user base grew. The sticky-emulation mechanism (via **-c**) was added later to support **autoload -U** and the modular completion system shipped with zsh, allowing system functions to run reliably regardless of the user's option settings.

# SEE ALSO

[zsh](/man/zsh)(1), [setopt](/man/setopt)(1), [bash](/man/bash)(1), [ksh](/man/ksh)(1)
