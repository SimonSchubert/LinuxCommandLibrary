# TAGLINE

Update auxiliary info files so dumb Git servers can serve a repository

# TLDR

**Regenerate** the server info files for the current repository

```git update-server-info```

**Force a full rebuild** of the info files from scratch

```git update-server-info --force```

**Run from inside a bare repository** (the usual server-side case)

```git -C [path/to/repo.git] update-server-info```

**Automatically refresh** info on every push via a post-update hook

```cp [path/to/repo.git]/hooks/post-update.sample [path/to/repo.git]/hooks/post-update```

# SYNOPSIS

**git** **update-server-info** [_-f_ | _--force_]

# DESCRIPTION

**git update-server-info** writes the auxiliary index files that allow a "dumb" HTTP, FTP, or rsync server to serve a Git repository without running any Git-aware service. A dumb server simply delivers raw files from disk, so it cannot enumerate refs or generate packs on the fly. The auxiliary files give clients enough metadata to discover what references and packs exist.

The command regenerates **objects/info/packs**, which lists every pack file in the object store, and **info/refs**, which lists every reference with its target object name. Clients fetching over a dumb transport read these files to plan what objects they need to download.

This step is unnecessary for repositories served by **git-daemon**, **git-http-backend**, or any other "smart" transport, because those services compute the same information on demand. It is only required for plain file servers such as Apache without the smart Git CGI, S3 buckets exposed over HTTP, or static hosting providers.

The stock **post-update** hook shipped with Git invokes this command, so enabling it on the server is usually the only setup needed. After every push, the hook refreshes the info files so subsequent dumb clients see the latest state.

# PARAMETERS

**-f**, **--force**

> Update the info files from scratch, ignoring any cached or partial state. Useful after manual repacking, when packs have been added or removed outside of Git's normal flow, or when the info files appear out of sync with the repository contents.

# OUTPUT FILES

**objects/info/packs**

> One **P pack-_xxx_.pack** line per pack in the object store. Dumb clients read this to learn which pack files they may need to download.

**info/refs**

> One _sha1_ TAB _refname_ line for every loose and packed ref. This is the dumb-transport equivalent of the ref advertisement that smart transports send.

# CAVEATS

Forgetting to run this command on a dumb server leaves clients seeing a stale view: pushed commits, new branches, and freshly created packs remain invisible until the info files are refreshed. The bundled **post-update** sample hook fixes this, but it must be made executable, since Git ships it with the **.sample** suffix and only the renamed version runs.

Running the command on a working tree is harmless but rarely useful, since local access uses the object database directly and never consults the info files.

# CONFIGURATION

Enable the auto-update hook on the server-side bare repository:

```
mv hooks/post-update.sample hooks/post-update
chmod +x hooks/post-update
```

The shipped hook contains a single line calling **exec git update-server-info**, so every push triggers a refresh.

# HISTORY

The dumb HTTP transport and its helper commands appeared in early Git releases, when smart transports over HTTP did not yet exist and many sites only had access to plain static web servers. Today **git update-server-info** is mostly a legacy compatibility tool, still maintained because some hosting setups (object storage, locked-down corporate proxies, archival mirrors) cannot run a smart Git service.

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

[git](/man/git)(1), [git-daemon](/man/git-daemon)(1), [git-repack](/man/git-repack)(1)
