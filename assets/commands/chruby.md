# TLDR

**List available Ruby versions**

```chruby```

**Switch to specific Ruby**

```chruby ruby-3.2.0```

**Switch to system Ruby**

```chruby system```

**Show current Ruby**

```chruby | grep '\*'```

# SYNOPSIS

**chruby** [_ruby_version_ | system]

# DESCRIPTION

**chruby** switches between multiple Ruby versions by modifying PATH and related environment variables. Lightweight alternative to RVM and rbenv. Just 90 lines of shell script.

Works with rubies installed by ruby-install or built from source.

# SETUP

Add to ~/.bashrc or ~/.zshrc:

```bash
source /usr/local/share/chruby/chruby.sh
```

For auto-switching:
```bash
source /usr/local/share/chruby/auto.sh
```

# AUTO-SWITCHING

With auto.sh loaded, chruby reads .ruby-version files:

```bash
echo "ruby-3.2.0" > .ruby-version
```

Checks current and parent directories automatically.

# DEFAULT VERSION

Set in ~/.bashrc or ~/.zshrc:

```bash
chruby ruby-3.2.0
```

# ENVIRONMENT

**RUBIES**
> Array of Ruby installation paths

**RUBY_ROOT**
> Current Ruby installation path

**GEM_HOME** / **GEM_PATH**
> Gem directories

# CAVEATS

Only switches versions - use ruby-install to install rubies. Does not override cd command (uses pre-prompt hook).

# SEE ALSO

[ruby-install](/man/ruby-install)(1), [rbenv](/man/rbenv)(1), [rvm](/man/rvm)(1)
