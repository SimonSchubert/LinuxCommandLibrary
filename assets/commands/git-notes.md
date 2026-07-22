# TAGLINE

Add metadata to commits

# TLDR

**Add note to HEAD**

```git notes add -m "[note text]"```

**Add note to specific commit**

```git notes add -m "[note]" [commit]```

**Show notes** for a commit

```git notes show [commit]```

**List all notes**

```git notes list```

**Edit existing note**

```git notes edit [commit]```

**Append text** to an existing note

```git notes append -m "[more text]" [commit]```

**Copy a note** from one commit to another

```git notes copy [from_commit] [to_commit]```

**Remove note**

```git notes remove [commit]```

**Push notes** to remote

```git push origin refs/notes/*```

**Fetch notes** from remote

```git fetch origin refs/notes/*:refs/notes/*```

# SYNOPSIS

**git notes** [_subcommand_] [_options_]

# PARAMETERS

**add**
> Add a new note to the given object (default: HEAD). Fails if a note already exists unless **-f** is used.

**show**
> Print the note for the given object.

**list**
> List notes for the given object, or list all notes if no object is specified.

**edit**
> Edit existing note in the configured editor.

**append**
> Append new content to an existing note.

**copy** _from_ _to_
> Copy the note from one object to another.

**remove**
> Remove notes for the given objects.

**prune**
> Remove notes attached to objects that no longer exist.

**merge** _ref_
> Merge notes from another notes ref.

**get-ref**
> Print the current notes ref.

**-m** _MSG_
> Use given message as the note text.

**-F** _FILE_
> Read note text from a file.

**-C** _OBJECT_
> Reuse note from given object.

**-c** _OBJECT_
> Reuse and edit note from given object.

**-f**, **--force**
> Overwrite an existing note.

**--ref** _REF_
> Use the given notes ref instead of the default **refs/notes/commits**.

# DESCRIPTION

**git notes** adds metadata to commits without modifying them. Notes are stored as separate refs under **refs/notes/**, allowing annotations, code review comments, build status, or other metadata to be attached after commits are created and even after they have been pushed.

Notes can be organized in namespaces using the **--ref** option. Since notes don't change commit hashes, they provide a non-destructive way to enrich commit history with additional context.

The default notes ref is **refs/notes/commits**, but you can keep separate notes namespaces (e.g. **refs/notes/review**, **refs/notes/build**) by using **--ref** or by setting **core.notesRef** in git config.

# CAVEATS

Notes are stored as separate refs and are not pushed or fetched by default. Use explicit refspecs like **refs/notes/*:refs/notes/*** to sync notes between repositories. Concurrent edits can cause notes-merge conflicts.

# HISTORY

**git notes** was added to Git in version **1.6.6** (December 2009) to allow attaching metadata to commits without rewriting history.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-log](/man/git-log)(1), [git-commit](/man/git-commit)(1), [git-push](/man/git-push)(1), [git-fetch](/man/git-fetch)(1)
