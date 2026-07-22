# TAGLINE

Manage GitLab merge requests from the command line

# TLDR

**List merge requests**

```glab mr list```

**Create merge request**

```glab mr create```

**View merge request**

```glab mr view [number]```

**Checkout merge request**

```glab mr checkout [number]```

**Merge a merge request**

```glab mr merge [number]```

**Approve merge request**

```glab mr approve [number]```

# SYNOPSIS

**glab** **mr** _command_ [_options_]

# SUBCOMMANDS

**list**
> List merge requests.

**create**
> Open a new merge request.

**view**
> Display a merge request.

**checkout**
> Check out a merge request branch locally.

**update**
> Modify merge request details (title, description, labels, etc.).

**merge**
> Merge a merge request.

**rebase**
> Rebase a merge request's source branch against its target.

**approve**
> Approve a merge request.

**approvers**
> View or manage merge request approvers.

**revoke**
> Revoke approval of a merge request.

**close**
> Close a merge request.

**reopen**
> Reopen a closed merge request.

**delete**
> Delete a merge request.

**diff**
> Show changes in a merge request.

**note**
> Add a comment to a merge request.

**issues**
> View issues linked to a merge request.

**subscribe** / **unsubscribe**
> Subscribe to, or stop following, a merge request's notifications.

**todo**
> Add a merge request to your GitLab to-do list.

# DESCRIPTION

**glab mr** manages GitLab merge requests from the command line. It provides subcommands for creating, viewing, reviewing, approving, and merging MRs without leaving the terminal. Run `glab mr <subcommand> --help` for the flags of each subcommand.

# INSTALL

```apt: sudo apt install glab```

```dnf: sudo dnf install glab```

```pacman: sudo pacman -S glab```

```apk: sudo apk add glab```

```zypper: sudo zypper install glab```

```brew: brew install glab```

```nix: nix profile install nixpkgs#glab```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[glab](/man/glab)(1), [glab-mr-create](/man/glab-mr-create)(1)

# RESOURCES

```[Documentation](https://docs.gitlab.com/cli/mr/)```

```[Source code](https://gitlab.com/gitlab-org/cli)```

<!-- verified: 2026-07-17 -->
