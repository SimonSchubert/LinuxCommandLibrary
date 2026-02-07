# TAGLINE

Record changes to the repository

# TLDR

**Commit staged changes**

```git commit -m "[message]"```

**Commit all tracked changes**

```git commit -am "[message]"```

**Amend last commit**

```git commit --amend```

**Commit with editor**

```git commit```

**Empty commit**

```git commit --allow-empty -m "[message]"```

**Commit with signoff**

```git commit -s -m "[message]"```

**Fixup commit**

```git commit --fixup [commit]```

**Squash commit**

```git commit --squash [commit]```

# SYNOPSIS

**git** **commit** [_options_] [_--_] [_files_...]

# PARAMETERS

**-m**, **--message** _msg_
> Commit message.

**-a**, **--all**
> Stage all modified files.

**--amend**
> Amend previous commit.

**--no-edit**
> Use previous message.

**-s**, **--signoff**
> Add Signed-off-by.

**--allow-empty**
> Allow empty commits.

**--fixup** _commit_
> Fixup for commit.

**--squash** _commit_
> Squash into commit.

**-v**, **--verbose**
> Show diff in editor.

**--author** _author_
> Override author.

# DESCRIPTION

**git commit** records changes to the repository by creating a new commit object containing the currently staged changes, metadata, and a descriptive message. Each commit represents a snapshot in the repository's history, identified by a unique SHA-1 hash and linked to its parent commit(s).

The standard workflow involves staging changes with git add, then committing those staged changes. The -a flag shortcuts this by automatically staging all modified tracked files before committing. Commit messages can be provided inline with -m or by opening an editor where you can write multi-line messages with detailed explanations.

The --amend option modifies the most recent commit instead of creating a new one, useful for correcting mistakes or adding forgotten changes. This rewrites history, so amended commits should not be pushed to shared branches unless force-pushing is acceptable.

Advanced options support signing commits with GPG (--gpg-sign), adding metadata like co-authors or issue references, and creating specialized commits for rebase workflows. The --fixup and --squash options create commits meant to be combined with earlier commits during interactive rebasing, supporting cleanup of messy development history.

Empty commits (--allow-empty) are occasionally useful for triggering CI/CD pipelines or marking milestones without actual code changes. The --verbose flag shows the full diff in the editor, helping write accurate commit messages by reviewing what's being committed.

# CONFIGURATION

**~/.gitconfig [commit]**
> Commit-related settings including default gpgSign, template, and cleanup behavior.

**.git/hooks/commit-msg**
> Hook script that validates or modifies commit messages before finalizing.

**.git/hooks/pre-commit**
> Hook script that runs checks before allowing a commit to proceed.

# SEE ALSO

[git-add](/man/git-add)(1), [git-status](/man/git-status)(1)

