# TAGLINE

Functional language runtime on Erlang VM

# TLDR

**Run Elixir script**

```elixir [script.exs]```

**Evaluate expression**

```elixir -e "[IO.puts \"Hello\"]"```

**Start with shell**

```elixir -S iex```

**Run with Mix** project

```elixir -S mix run```

**Start named node**

```elixir --name [node@host] -S iex```

**Set environment**

```MIX_ENV=prod elixir -S mix phx.server```

# SYNOPSIS

**elixir** [_options_] [_script_] [_args_]

# PARAMETERS

_SCRIPT_
> Elixir script file to run.

**-e** _CODE_
> Evaluate code string.

**-r** _FILE_
> Require file before execution.

**-S** _SCRIPT_
> Run Erlang/Elixir script.

**--name** _NAME_
> Set distributed node name.

**--sname** _NAME_
> Set short node name.

**--cookie** _COOKIE_
> Set Erlang distribution cookie.

**--help**
> Display help information.

# DESCRIPTION

**elixir** runs Elixir code and scripts. It's the primary command for executing Elixir programs, supporting both script files (.exs) and compiled modules.

The command starts the Erlang VM with Elixir loaded. Options control distributed computing settings, code loading, and execution mode. Combined with `-S mix`, it runs Mix tasks.

Elixir's interactive shell (IEx) can be started using `elixir -S iex` for development and debugging.

# CAVEATS

Requires Erlang/OTP installed. Startup time includes BEAM VM boot. Scripts have .exs extension by convention. Distributed features need network configuration.

# HISTORY

Elixir was created by **José Valim** and released in **2011**, running on the Erlang BEAM VM. It brought modern syntax and tooling to the Erlang ecosystem while maintaining compatibility.

# SEE ALSO

[iex](/man/iex)(1), [mix](/man/mix)(1), [erl](/man/erl)(1)
