# TAGLINE

Delete both local and remote tags

# TLDR

**Delete a local and remote tag**

```git delete-tag [tag_name]```

**Delete multiple tags at once**

```git delete-tag [tag1] [tag2]```

# SYNOPSIS

**git** **delete-tag** _tag_ [_tag_...]

# DESCRIPTION

**git delete-tag** deletes a tag both locally and on the remote in a single operation. Part of the git-extras collection, it simplifies tag removal by combining what would normally require separate git tag -d and git push origin --delete commands.

Tags typically mark release points or significant commits, but occasionally need removal due to mistakes, versioning changes, or release rollbacks. This command ensures synchronization between local and remote repositories, preventing scenarios where a deleted local tag still appears when fetching from the remote.

# SEE ALSO

[git-tag](/man/git-tag)(1), [git-extras](/man/git-extras)(1), [git-push](/man/git-push)(1), [git-delete-branch](/man/git-delete-branch)(1)
