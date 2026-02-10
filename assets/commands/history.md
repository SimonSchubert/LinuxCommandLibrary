# TAGLINE

bash builtin command that displays or manipulates the command history list

# TLDR

**Display command history** with line numbers

```history```

**Show the last N commands**

```history [20]```

**Clear the entire history**

```history -c```

**Delete a specific history entry** by line number

```history -d [42]```

**Append current session history** to the history file

```history -a```

**Read history file** and append to current list

```history -r```

**Write current history** to the history file

```history -w```

**Execute a command** from history by number

```![42]```

**Execute the previous command**

```!!```

# SYNOPSIS

**history** [_n_]

**history** -c

**history** -d _offset_

**history** [-anrw] [_filename_]

**history** -ps _arg_

# PARAMETERS

**-c**
> Clear the history list

**-d** _OFFSET_
> Delete the history entry at position offset

**-d** _START-END_
> Delete the range of history entries between start and end

**-a**
> Append new history lines to the history file

**-n**
> Read history lines not already read from the file to current list

**-r**
> Read the history file and append contents to the history list

**-w**
> Write current history to the history file

**-p**
> Perform history substitution on args and display without storing

**-s** _ARG_
> Add args to the end of the history list as a single entry

# ENVIRONMENT

**HISTFILE**
> File where history is saved (default: ~/.bash_history)

**HISTSIZE**
> Number of commands kept in memory for current session

**HISTFILESIZE**
> Number of commands kept in the history file

**HISTTIMEFORMAT**
> Format string for timestamps (strftime format)

**HISTCONTROL**
> Controls what is saved (ignorespace, ignoredups, erasedups)

**HISTIGNORE**
> Colon-separated patterns of commands to ignore

# DESCRIPTION

**history** is a bash builtin command that displays or manipulates the command history list. The shell maintains a record of commands entered during a session, allowing quick access to previous commands.

Without arguments, history displays the numbered list of commands. With an integer argument **n**, it shows the last n entries. The history is loaded from **HISTFILE** at shell startup and can be written back with **-w** or automatically on exit.

History expansion allows re-executing previous commands: **!!** repeats the last command, **!n** executes command number n, **!string** executes the most recent command starting with string, and **!?string** matches any command containing string. Use **Ctrl+r** for interactive reverse search.

# CAVEATS

Commands starting with a space are not saved if **HISTCONTROL** contains ignorespace. The history is per-shell and not shared between concurrent sessions unless explicitly synchronized with **-a** and **-r**. History files can contain sensitive information like passwords accidentally typed on the command line. Use **HISTIGNORE** to exclude sensitive commands.

# HISTORY

Command history originated in the **C shell** (csh) developed by Bill Joy in the late 1970s at Berkeley. The bash implementation builds on the **GNU Readline** library, which provides history manipulation and editing capabilities. The history command and expansion syntax became a standard feature in Unix shells, allowing users to efficiently reuse and modify previous commands.

# SEE ALSO

[bash](/man/bash)(1), [fc](/man/fc)(1), [readline](/man/readline)(3)
