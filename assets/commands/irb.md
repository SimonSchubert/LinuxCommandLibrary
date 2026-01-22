# TLDR

**Start interactive Ruby**

```irb```

**Start without prompt**

```irb --noprompt```

**Load file before starting**

```irb -r [library]```

**Evaluate expression**

```irb -e "[puts 'hello']"```

**Start with specific Ruby**

```irb --version```

**Simple prompt**

```irb --simple-prompt```

# SYNOPSIS

**irb** [_options_] [_file_]

# PARAMETERS

**-r** _LIBRARY_
> Require library before starting.

**-e** _EXPR_
> Evaluate expression.

**--noprompt**
> Suppress prompt.

**--simple-prompt**
> Use simple prompt.

**--inf-ruby-mode**
> Emacs inf-ruby compatibility.

**-I** _PATH_
> Add to load path.

**--help**
> Display help information.

# DESCRIPTION

**irb** is the Interactive Ruby shell. It provides a REPL for evaluating Ruby expressions and exploring code.

The shell supports tab completion, history, and multi-line input. It's the standard tool for Ruby experimentation.

irb is the Ruby interactive shell.

# CAVEATS

Requires Ruby installed. No persistent state. Consider pry for advanced features.

# HISTORY

irb has been part of **Ruby** since early versions, created by **Keiju Ishitsuka** as the standard Ruby REPL.

# SEE ALSO

[ruby](/man/ruby)(1), [pry](/man/pry)(1), [gem](/man/gem)(1), [bundle](/man/bundle)(1)
