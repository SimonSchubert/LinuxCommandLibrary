# TAGLINE

UNIX shell written in pure Ruby

# TLDR

**Start** an interactive Rubish session

```rubish```

**Run** a single command and exit

```rubish -c '[echo hello]'```

**Execute** a shell script file

```rubish [script.sh]```

**Start** in restricted mode, disabling Ruby integration for untrusted scripts

```rubish -r```

**Pipe** command output through Ruby methods

```rubish -c '[ls().sort.uniq]'```

# SYNOPSIS

**rubish** [_-c command_] [_-r_] [_script_] [_arguments..._]

# DESCRIPTION

**rubish** is an interactive UNIX shell implemented entirely in Ruby. It parses familiar bash syntax and compiles it to Ruby for execution, so existing scripts keep working while the full Ruby language becomes available on the command line. It can be used as a login shell via **chsh**.

The shell blurs the line between shell and scripting language. External commands return objects that can be chained with dot notation (for example **ls().sort.uniq**), output can be processed line by line with Ruby iterators such as **.each** and **.map**, and Ruby expressions may be used as conditions in **if**, **while**, and **until** by wrapping them in **{ }**. A line beginning with a capital letter is evaluated directly as Ruby code, and functions can be defined with Ruby's **def...end** syntax.

For familiarity it also supports a number of zsh conveniences, including **setopt**, **autoload**, and abbreviated path expansion, along with custom dynamically-generated prompts and lazy loading of slow initializations in background threads.

# PARAMETERS

**-c** _command_
> Execute _command_ as a single string and exit.

**-r**
> Restricted mode: disable Ruby integration features for running untrusted scripts.

# CONFIGURATION

Rubish is configured in Ruby rather than a bespoke config language. Prompts are defined as Ruby functions for fully dynamic prompt strings, options can be toggled with zsh-style **setopt**, and expensive startup work can be deferred with lazy loading so the shell stays responsive.

# CAVEATS

Rubish requires a compatible Ruby interpreter to be available. As a young project it is best treated as experimental for daily use, and the deep Ruby integration is a security concern when running untrusted input, which is why **-r** restricted mode exists.

# HISTORY

**rubish** was created by **Atsushi Matsuda** (amatsuda), a prominent Ruby on Rails core contributor, as a shell written in pure Ruby. It is released as open-source software under the **MIT** license.

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1), [ruby](/man/ruby)(1), [irb](/man/irb)(1)
