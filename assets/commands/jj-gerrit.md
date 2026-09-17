# TAGLINE

uploads Jujutsu changes to Gerrit for code review

# TLDR

**Upload the current change** (or its parent if the working copy has no description)

```jj gerrit upload```

**Upload a specific revision** and its mutable ancestors

```jj gerrit upload -r [revset]```

**Upload several revsets**

```jj gerrit upload -r [revset1] -r [revset2]```

**Target a remote branch** for merging

```jj gerrit upload -r [revset] -b [branch]```

**Push to a named Gerrit remote**

```jj gerrit upload --remote [gerrit]```

**Add reviewers and CC recipients** by email (flags can be repeated)

```jj gerrit upload --reviewer [reviewer@example.com] --cc [cc@example.com]```

**Preview the upload** without contacting Gerrit

```jj gerrit upload -n```

**Mark the change as work in progress**

```jj gerrit upload --wip```

# SYNOPSIS

**jj gerrit** _command_ [_options_]

**jj gerrit upload** [_options_]

# PARAMETERS

**upload**
> Upload changes to Gerrit for code review, or update existing changes that share the same **Change-Id**.

**-r**, **--revision** _REVSETS_
> Revisions to upload. All mutable ancestors of the specified revisions are also pushed, so **-r** _foo_ is equivalent to **-r** `mutable()::foo`. If omitted, **@** is uploaded when it has a description, otherwise **@-**.

**-b**, **--remote-branch** _BRANCH_
> Destination branch on the Gerrit remote. Default: **gerrit.default-remote-branch**.

**--remote** _REMOTE_
> Git remote or full SSH URL to push to. Default: **gerrit.default-remote**, otherwise a remote named **gerrit**.

**-n**, **--dry-run**
> Show what would change on the remote without pushing.

**--reviewer** _EMAIL_
> Add this address as a reviewer (repeatable).

**--cc** _EMAIL_
> CC this address on the change (repeatable).

**-l**, **--label** _LABEL_
> Set a Gerrit label (repeatable). A suffix such as **+2** sets the value; default is **+1**. Gerrit silently ignores labels that are not configured on the host.

**--topic** _TOPIC_
> Group the change under a Gerrit topic. Gerrit can be configured to submit every change in a topic together.

**--hashtag** _HASHTAG_
> Attach a freeform hashtag (repeatable). Unlike topics, hashtags are informational only.

**-m**, **--message** _MESSAGE_
> Description for the uploaded patch set.

**--edit**
> Push as a change edit on an existing Gerrit change. Edits must be published from the web UI; a new edit replaces the previous one.

**--wip**
> Mark the change as work in progress.

**--ready**
> Mark the change as ready for review.

**--private** / **--remove-private**
> Mark or unmark the change as private.

**--publish-comments** / **--no-publish-comments**
> Publish or withhold draft comments. **--no-publish-comments** is useful when the account is configured to publish comments by default.

**--notify** _WHO_
> Who receives email: **none**, **owner**, **owner-reviewers**, or **all** (default).

**--submit**
> Submit the changes immediately, bypassing code review.

**--skip-validation**
> With **--submit**, skip Gerrit validations.

**--merged**
> Create a new change even if the change has already been merged.

**--ignore-attention-set**
> Do not modify the Gerrit attention set.

**--deadline** _DEADLINE_
> Abort the push after this deadline.

**--custom** _KEY=VALUE_
> Send a custom keyed value to Gerrit (repeatable).

**-o**, **--option** _OPTION_
> Pass a `git push -o` option (repeatable).

**--trace** _TRACE_
> Enable Gerrit upload tracing for debugging.

# DESCRIPTION

**jj gerrit** talks to a Gerrit Code Review instance over a Git remote. The only subcommand is **upload**, which creates one Gerrit change for each selected revision (and its mutable ancestors). Re-uploading a revision that already carries the same **Change-Id** adds a new patch set instead of opening a new change.

Jujutsu tracks a stable change identity across rewrites, and Gerrit tracks the same logical change through the **Change-Id** trailer. The two identifiers are not natively the same; **jj gerrit upload** bridges them by adding a Gerrit-style **Change-Id** derived from the Jujutsu change ID when the commit has none. That trailer is added only on the uploaded commit, so the Gerrit commit ID can differ from the local one.

After review feedback, edit the revisions and run **jj gerrit upload** again with the same revsets. Keep the original Jujutsu change (and its **Change-Id**) when splitting or squashing so Gerrit continues to update the existing review.

# CONFIGURATION

Set the default remote and destination branch in user or repo config:

```
[gerrit]
default-remote = "gerrit"
default-remote-branch = "main"
```

To write **Change-Id** trailers into local commits instead of only on upload:

```
[templates]
commit_trailers = '''
if(
  !trailers.contains_key("Change-Id"),
  format_gerrit_change_id_trailer(self)
)
'''
```

Since Gerrit 3.3.1, a **Link** trailer of the form `<review-url>/id/I<change-id>` can replace **Change-Id**. Enable it with `jj config set --repo gerrit.review-url [review-url]`.

# CAVEATS

Subcommand of **jj**. The Gerrit remote must already exist (`jj git remote add`, clone, or `jj git init` in a Git repo that already has one). If **gerrit.default-remote** is unset and no remote named **gerrit** exists, the upload fails until you pass **--remote** or set the default.

Because auto-generated **Change-Id** trailers live only on the uploaded commit, fetching a merged change can produce a divergent local revision. Abandon the local change or rebase onto trunk with `jj rebase --skip-emptied ...`. Configuring **commit_trailers** as above avoids that mismatch. Duplicate **Change-Id** values across different changes are rejected by Gerrit (or can overwrite an existing change if uploaded separately).

# HISTORY

**jj gerrit** is part of **Jujutsu**. Gerrit and Jujutsu share a change-identity model (Gerrit's **Change-Id** vs jj's change ID), which is why upload maps each jj change onto a single Gerrit review.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-17 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-git](/man/jj-git)(1), [jj-git-push](/man/jj-git-push)(1), [jj-git-remote](/man/jj-git-remote)(1), [git-push](/man/git-push)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/gerrit/)```

<!-- verified: 2026-09-17 -->
