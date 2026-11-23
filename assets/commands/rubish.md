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

**rubish** is an interactive UNIX shell implemented entirely in Ruby. It parses bash syntax (aiming for full bash compatibility) and compiles it to Ruby code executed by the Ruby VM, so existing scripts keep working while the full Ruby language becomes available on the command line. It can be used as a login shell via **chsh**.

The shell blurs the line between shell and scripting language. External commands return objects that can be chained with dot notation (for example **ls().sort.uniq**), output can be processed line by line with Ruby iterators such as **.each** and **.map**, and Ruby expressions may be used as conditions in **if**, **while**, and **until** by wrapping them in **{ }**. A line beginning with a capital letter is evaluated directly as Ruby code, and functions can be defined with Ruby's **def...end** syntax.

For familiarity it also supports a number of zsh conveniences, including **setopt**, **compdef**/**compinit**, **autoload**, **RPROMPT**, and abbreviated path expansion, along with fish-style inline auto-suggestions, tab completion derived from each tool's **--help** output, custom Ruby prompts, and lazy loading of slow initializations in background threads.

# PARAMETERS

**-c** _command_
> Execute _command_ as a single string and exit.

**-r**
> Restricted mode: disable Ruby integration (inline evaluation, lambdas, blocks, Ruby conditions, array literals) for running untrusted scripts.

# CONFIGURATION

**~/.config/rubish/config** or **~/.rubishrc**
> Interactive shell startup file (falls back to **~/.bashrc**). A project-local **./.rubishrc** is also read.

**~/.config/rubish/profile** or **~/.rubish_profile**
> Login shell startup file, read after **/etc/profile** (falls back to **~/.bash_profile**, **~/.bash_login**, **~/.profile**).

**~/.config/rubish/logout** or **~/.rubish_logout**
> Read when a login shell exits.

Prompts can be defined as Ruby functions (**rubish_prompt**, **rubish_right_prompt**), and slow initializations such as **rbenv init** can be wrapped in **lazy_load { ... }** blocks.

# CAVEATS

Rubish requires a compatible Ruby interpreter to be available. As a young project it is best treated as experimental for daily use, and the deep Ruby integration is a security concern when running untrusted input, which is why **-r** restricted mode exists.

# HISTORY

**rubish** was created in **2026** by **Akira Matsuda** (amatsuda), a Ruby and Ruby on Rails committer, as a shell written in pure Ruby. It is released as open-source software under the **MIT** license.

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1), [ruby](/man/ruby)(1), [irb](/man/irb)(1)

# RESOURCES

```[Source code](https://github.com/amatsuda/rubish)```

<!-- verified: 2026-11-23 -->
