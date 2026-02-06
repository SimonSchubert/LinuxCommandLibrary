# GIT

## Clone an existing repository
```[git](/man/git) clone [url]```

## Initialize new version-controlled project
```[git](/man/git) init```

## Save changes to the repository
```[git](/man/git) add .```
```[git](/man/git) commit -m "first commit"```

## Current state of the repository
```[git](/man/git) status```

## Create a new branch
```[git](/man/git) branch [branchName]```

## List all remote or local branches
```[git](/man/git) branch -a```

## Delete a branch
```[git](/man/git) branch -d [branchName]```

## Merge changes into current branch
```[git](/man/git) merge [branchName]```

## Checkout an existing branch
```[git](/man/git) checkout [branchName]```
```[git](/man/git) switch [branchName]```

## Checkout and create a new branch with that name
```[git](/man/git) checkout -b [newBranch]```
```[git](/man/git) switch -c [newBranch]```

## Create a tag
```[git](/man/git) tag [tagName]```

## Delete the tag
```[git](/man/git) tag -d [tagName]```

## Push tags
```[git](/man/git) push --tags```

## Get the latest version of a repository
```[git](/man/git) pull [branchName] [remoteURL/remoteName]```

## Add remote repository
```[git](/man/git) remote add [remoteName] [remoteURL]```

## Define the author name to be used for all commits
```[git](/man/git) config --global user.name [name]```

## Define the author email to be used for all commits
```[git](/man/git) config --global user.email [email]```

## Helpful guides that come with Git
```[git](/man/git) help -g```

## Undo the previous commit
```[git](/man/git) revert HEAD^```

## Forget about files that were tracked but are now in .gitignore
```[git](/man/git) rm -r --cached .```
```[git](/man/git) add .```
```[git](/man/git) commit -am "remove ignored files"```

## Send local commits to the remote repository
```[git](/man/git) push [remoteURL/remoteName] [branch]```

## Store current work with untracked files
```[git](/man/git) stash -u```

## Bring stashed work back to the working directory
```[git](/man/git) stash pop```

## Remove a file from the working index (cached)
```[git](/man/git) rm --cached [fileName]```

## Delete a file (force)
```[git](/man/git) rm -f [fileName]```

## Remove an entire directory from the working index (cached)
```[git](/man/git) rm -r --cached [directoryName]```

## Delete an entire directory (force)
```[git](/man/git) rm -r -f [directoryName]```

## Delete a remote branch
```[git](/man/git) push origin :[branchName]```

## Show commit log
```[git](/man/git) log```
```[git](/man/git) log --oneline```

## Show changes
```[git](/man/git) diff```

## Show remote URLs
```[git](/man/git) remote -v```

## Amend last commit message
```[git](/man/git) commit --amend```

## Blame a file
```[git](/man/git) blame [fileName]```

## Cherry-pick a commit
```[git](/man/git) cherry-pick [commitHash]```

## Rebase onto another branch
```[git](/man/git) rebase [branchName]```
