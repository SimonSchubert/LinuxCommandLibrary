# TAGLINE

interactive Elixir shell

# TLDR

**Start interactive Elixir**

```iex```

**Start with project**

```iex -S mix```

**Evaluate expression**

```iex -e "IO.puts(:hello)"```

**Connect to node**

```iex --remsh [node@host]```

**Start with name**

```iex --sname [mynode]```

**Load file**

```iex [script.exs]```

# SYNOPSIS

**iex** [_options_] [_file_]

# PARAMETERS

_FILE_
> Script file to load.

**-S** _SCRIPT_
> Run script (e.g., mix).

**-e** _EXPR_
> Evaluate expression.

**--remsh** _NODE_
> Remote shell to node.

**--sname** _NAME_
> Short node name.

**--name** _NAME_
> Full node name.

**--help**
> Display help information.

# DESCRIPTION

**iex** is the Interactive Elixir shell. It provides a REPL for evaluating Elixir expressions and exploring code.

The shell supports tab completion, history, and documentation lookup. It integrates with Mix projects and remote nodes.

# CAVEATS

Requires Elixir/Erlang. Node features need setup. Mix integration common.

# HISTORY

iex is part of **Elixir**, created by **José Valim** as a functional language on the Erlang VM.

# INSTALL

```apt: sudo apt install elixir```

```dnf: sudo dnf install elixir```

```pacman: sudo pacman -S elixir```

```apk: sudo apk add elixir```

```zypper: sudo zypper install elixir```

```brew: brew install elixir```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[elixir](/man/elixir)(1), [mix](/man/mix)(1), [erl](/man/erl)(1)
