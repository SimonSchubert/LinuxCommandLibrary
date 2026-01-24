# TLDR

**Add readline to command**

```rlwrap [command]```

**With history file**

```rlwrap -H [~/.command_history] [command]```

**With completion file**

```rlwrap -f [completions.txt] [command]```

**Always readline** (even if terminal)

```rlwrap -a [command]```

**Remember multi-line input**

```rlwrap -m [command]```

**Quote special characters**

```rlwrap -q '"' [command]```

**Case-insensitive completion**

```rlwrap -i [command]```

# SYNOPSIS

**rlwrap** [_-a_] [_-H file_] [_-f file_] [_-i_] [_options_] _command_ [_args_]

# PARAMETERS

**-a**, **--always-readline**
> Always use readline.

**-H** _FILE_
> History file.

**-f** _FILE_
> Completions file.

**-i**, **--case-insensitive**
> Case-insensitive completion.

**-m** [_CHAR_]
> Multi-line mode.

**-q** _CHAR_
> Quote character.

**-c**, **--complete-filenames**
> Complete filenames.

**-r**, **--remember**
> Remember input for completion.

**-p** _PROMPT_
> Prompt color.

**-b** _CHARS_
> Word break characters.

**-s** _N_
> History size.

**--no-warnings**
> Suppress warnings.

# DESCRIPTION

**rlwrap** adds readline capabilities to any command. It provides line editing, history, and completion for programs that lack them.

History persists across sessions when using -H. Previous inputs are searchable with Ctrl-R. Arrow keys navigate history.

Completion files contain words for Tab completion. The -r option learns words from output, building dynamic completions.

Multi-line mode handles commands spanning multiple lines. This is useful for SQL clients and REPLs that accept multi-line input.

The tool intercepts input, processes it through readline, then passes it to the wrapped command. Output passes through unchanged.

Prompts are detected and colorized. This improves visibility in interactive sessions.

# CAVEATS

May interfere with programs that handle terminals specially. Prompt detection is heuristic. Some control sequences may not work properly.

# HISTORY

**rlwrap** was written by **Hans Lub** to add readline support to arbitrary programs. It fills the gap for programs without built-in line editing.

# SEE ALSO

[readline](/man/readline)(3), [bash](/man/bash)(1), [ledit](/man/ledit)(1)
