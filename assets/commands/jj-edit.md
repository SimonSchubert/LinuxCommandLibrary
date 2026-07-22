# TAGLINE

sets the working copy to a specific revision for editing

# TLDR

**Edit specific revision**

```jj edit [revision]```

**Edit parent of current revision**

```jj edit @-```

# SYNOPSIS

**jj** **edit** _revision_

# DESCRIPTION

**jj edit** sets the working copy to a specific revision for editing. The working copy becomes a child of the specified revision, allowing you to modify it. Changes are automatically recorded in the revision being edited.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-new](/man/jj-new)(1), [jj-squash](/man/jj-squash)(1)

