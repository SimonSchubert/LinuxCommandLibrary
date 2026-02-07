# TAGLINE

Dump pack index file contents

# TLDR

**Show pack index contents**

```git show-index < [.idx file]```

# SYNOPSIS

**git** **show-index** < _index_file_

# DESCRIPTION

**git show-index** reads a pack index file from stdin and dumps its contents. It displays the byte offset and SHA-1 hash for each object in the corresponding pack file.

This is a low-level plumbing command used for debugging and inspecting Git's internal pack file structure.

# SEE ALSO

[git-verify-pack](/man/git-verify-pack)(1), [git-index-pack](/man/git-index-pack)(1)
