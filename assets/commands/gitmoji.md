# TAGLINE

Interactive emoji guide for commit messages

# TLDR

**Interactive commit**

```gitmoji -c```

**List available emojis**

```gitmoji -l```

**Search emoji**

```gitmoji -s [bug]```

**Initialize repo**

```gitmoji -i```

**Configure gitmoji**

```gitmoji -g```

**Remove commit hook**

```gitmoji -r```

**Update emoji list**

```gitmoji -u```

# SYNOPSIS

**gitmoji** [_options_]

# PARAMETERS

**-c**, **--commit**
> Interactive commit with emoji.

**-l**, **--list**
> List all gitmojis.

**-s** _TEXT_, **--search** _TEXT_
> Search for emoji.

**-i**, **--init**
> Initialize gitmoji as a commit hook.

**-r**, **--remove**
> Remove a previously initialized commit hook.

**-g**, **--config**
> Configure settings.

**-u**, **--update**
> Sync emoji list with the repo.

**-v**, **--version**
> Print installed version.

**--help**
> Display help information.

# DESCRIPTION

**gitmoji** adds emoji to commit messages following a standardized convention. Each emoji represents a commit type (bug fix, feature, docs, etc.), making commit history more visual and scannable.

The interactive mode guides through emoji selection and message composition. It can be installed as a Git hook for automatic emoji prompts on every commit.

# CAVEATS

Node.js tool. Team must agree on convention. Some tools may not render emojis.

# HISTORY

gitmoji was created by **Carlos Cuesta** to standardize emoji use in commit messages, making repository history more expressive.

# SEE ALSO

[git-commit](/man/git-commit)(1), [gitlint](/man/gitlint)(1)
