# TLDR

**Start Erlang shell**

```erl```

**Run with module**

```erl -s [module] [function]```

**Run and halt**

```erl -noshell -s [module] [function] -s init stop```

**Start named node**

```erl -name [node@host]```

**Set cookie for** distribution

```erl -setcookie [secret]```

**Load paths**

```erl -pa [ebin/]```

**Evaluate expression**

```erl -eval "[io:format(\"Hello~n\")]"```

# SYNOPSIS

**erl** [_options_]

# PARAMETERS

**-s** _MOD_ [_FUNC_ [_ARGS_]]
> Start module function.

**-noshell**
> Run without interactive shell.

**-name** _NAME_
> Long node name.

**-sname** _NAME_
> Short node name.

**-setcookie** _COOKIE_
> Distribution cookie.

**-pa** _DIR_
> Prepend to code path.

**-eval** _EXPR_
> Evaluate expression at startup.

**-config** _FILE_
> Configuration file.

# DESCRIPTION

**erl** starts the Erlang runtime system and interactive shell. It's the primary way to run Erlang programs, either interactively or in batch mode.

The shell provides an interactive environment for evaluating Erlang expressions. For production use, -noshell runs without the shell, and -s/-eval execute specific code.

Erlang's distributed features are enabled through node naming (-name/-sname) and authentication (-setcookie).

# CAVEATS

Shell differs from module syntax. Distribution requires matching cookies. Node names must be unique. Memory usage scales with processes.

# HISTORY

Erlang was developed at **Ericsson** starting in **1986** by **Joe Armstrong**, **Robert Virding**, and **Mike Williams** for telecom systems. The erl command has been the standard way to run Erlang since its open-source release in **1998**.

# SEE ALSO

[erlc](/man/erlc)(1), [elixir](/man/elixir)(1), [rebar3](/man/rebar3)(1)
