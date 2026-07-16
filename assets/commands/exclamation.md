# TAGLINE

shell history expansion syntax

# TLDR

**Repeat** the last command

```!!```

**Rerun** the last command with sudo

```sudo !!```

**Repeat** the last command starting with a string

```![string]```

**Repeat** command number N from history

```![N]```

**Repeat** the Nth previous command

```!-[N]```

**Reuse** the last argument of the previous command

```[command] !$```

**Repeat** the last command with a substitution

```^[old]^[new]```

**Print** an expansion instead of running it

```!![:p]```

# SYNOPSIS

**!**_event_[**:**_word_][**:**_modifier_ ...]

**^**_old_**^**_new_[**^**]

# EVENT DESIGNATORS

**!!**
> The previous command. Shorthand for **!-1**.

**!n**
> Command line number n, as shown by **history**.

**!-n**
> The command n lines back.

**!string**
> The most recent command starting with _string_.

**!?string?**
> The most recent command containing _string_. The trailing **?** is optional at end of line.

**!#**
> The current command line typed so far.

**^old^new**
> Quick substitution: repeat the previous command replacing the first occurrence of _old_ with _new_. Equivalent to **!!:s/old/new/**.

# WORD DESIGNATORS

Words are numbered from **0**, and are separated from the event by a colon. The colon may be omitted when the designator starts with **^**, **$**, **\***, **-** or **%**.

**:0**
> The command name.

**:n**
> The nth word, counting the command as word 0. So **:1** is the first argument.

**:^**
> The first argument. Same as **:1**.

**:$**
> The last argument.

**:%**
> The word matched by the most recent **?string?** search.

**:\***
> All words except the 0th. Same as **:1-$**, and expands to nothing if there is only one word.

**:n-m**
> The range of words from n to m.

**:n\***
> From word n to the last. Same as **:n-$**.

**:n-**
> From word n to the second-to-last word.

# MODIFIERS

**:h**
> Head: remove the trailing pathname component, leaving the directory.

**:t**
> Tail: remove all leading pathname components, leaving the filename.

**:r**
> Root: remove the trailing file extension.

**:e**
> Extension: remove all but the extension.

**:s/old/new/**
> Substitute the first occurrence of _old_ with _new_.

**:gs/old/new/**
> Substitute all occurrences. **g** is a prefix that repeats the following modifier.

**:&**
> Repeat the previous substitution.

**:p**
> Print the resulting command without executing it, and add it to the history.

**:q**
> Quote the result, protecting it from further expansion.

**:x**
> Like **:q**, but split into words on whitespace.

# DESCRIPTION

History expansion lets you rebuild a previous command without retyping it. It is a feature of the shell's interactive history mechanism, present in **bash**, **zsh**, **csh** and **tcsh**, and is performed very early: the line is rewritten before quoting, parameter expansion, or any other processing takes place.

A reference has three parts. The **event designator** selects a line from history, an optional **word designator** picks words out of it, and any number of **modifiers** transform the result. So **!!** repeats the whole previous line, **!!:1** takes only its first argument, and **!!:1:h** takes that argument's directory.

Several forms are common enough to be worth memorizing. **sudo !!** rerunning the previous command with privileges is the classic. **!$** grabs the last argument of the previous line, which is usually the file you were just working with, making **vim !$** a natural follow-on to **ls some/long/path/file.txt**. **^old^new** fixes a typo in the previous command in place.

Because expansion happens on the input line rather than at execution, the expanded text is echoed back before it runs, so you can see exactly what the shell made of your reference.

# CAVEATS

The **!** character keeps its special meaning inside **double quotes**. Writing **echo "hello!"** or a password containing **!** can trigger an unexpected expansion or an "event not found" error. Single quotes suppress it, as does a backslash escape. In bash, **set +H** turns history expansion off entirely, which is a common line in **.bashrc** for people who never use it.

History expansion is only enabled in interactive shells, so it is not available in scripts and cannot be relied on for portable scripting.

**!string** silently reruns whatever it matches, which may not be the command you had in mind if your history has moved on. Append **:p** first to see the expansion before committing to it, especially with anything destructive.

Details differ between shells: zsh supports extra modifiers such as **:G**, and csh's implementation, where the syntax originated, differs in a number of corners.

# HISTORY

History expansion originated in the **C shell**, written by **Bill Joy** at Berkeley in the late **1970s**, and its syntax was carried into **tcsh**, **bash** and **zsh** largely unchanged. In bash it is implemented by the **history library** that ships with **GNU Readline**.

# SEE ALSO

[history](/man/history)(1), [fc](/man/fc)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1), [csh](/man/csh)(1)

# RESOURCES

```[Documentation](https://www.gnu.org/software/bash/manual/bash.html#History-Interaction)```

<!-- verified: 2026-07-16 -->
