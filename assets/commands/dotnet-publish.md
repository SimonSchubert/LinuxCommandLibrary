# TAGLINE

deployment package builder and publisher

# TLDR

**Publish for deployment** (Release by default on .NET 8+)

```dotnet publish```

**Publish a self-contained** app for a target runtime

```dotnet publish -r [linux-x64] --self-contained```

**Publish a single-file** executable

```dotnet publish -r [linux-x64] -p:PublishSingleFile=true```

**Publish to a directory**

```dotnet publish -o [./publish]```

**Publish trimmed**, for smaller self-contained output

```dotnet publish -r [linux-x64] --self-contained -p:PublishTrimmed=true```

**Cross-compile** by naming the OS and architecture separately

```dotnet publish --os [linux] --arch [arm64]```

**Publish using a profile** from Properties/PublishProfiles

```dotnet publish -p:PublishProfile=[FolderProfile]```

# SYNOPSIS

**dotnet publish** [_project_|_solution_|_file_] [_options_]

# PARAMETERS

_PROJECT_ | _SOLUTION_ | _FILE_
> What to publish. Defaults to the project or solution found in the current directory.

**-c**, **--configuration** _CONFIG_
> Build configuration. Defaults to **Release** when building `net8.0` or later with the .NET 8 SDK or newer, and to Debug otherwise.

**-r**, **--runtime** _RID_
> Publish for a given Runtime Identifier, such as `linux-x64` or `osx-arm64`. Pair it with **--self-contained** or **--no-self-contained**.

**-a**, **--arch** _ARCH_ / **--os** _OS_
> Shorthand that combines with the current platform to form the RID. Do not combine these with **-r**.

**--sc**, **--self-contained**
> Publish the .NET runtime alongside the app, so nothing needs to be installed on the target.

**--no-self-contained**
> Publish framework-dependent: a compatible .NET runtime must already exist on the target.

**--ucr**, **--use-current-runtime**
> Use the machine's own runtime as the target.

**-o**, **--output** _DIR_
> Output directory. Defaults to `bin/<configuration>/<framework>/publish/`, with the RID appended for self-contained output.

**-f**, **--framework** _TFM_
> Publish for one target framework of a multi-targeted project.

**-p**, **--property**:_NAME_=_VALUE_
> Set an MSBuild property. This is how `PublishSingleFile`, `PublishTrimmed`, `PublishReadyToRun`, and `PublishAot` are enabled.

**--no-build**
> Do not build first; use existing output. Implies **--no-restore**.

**--no-restore**
> Skip the implicit `dotnet restore`.

**--no-dependencies**
> Ignore project-to-project references and restore only the root project.

**--artifacts-path** _DIR_
> Put all build output under one directory, separated by project.

**--manifest** _FILE_
> Trim the published package set against a target manifest.

**--version-suffix** _SUFFIX_
> Replace the `*` in the project's version field.

**--nologo**
> Suppress the startup banner.

**--tl**:[**auto**|**on**|**off**]
> Control the Terminal Logger for build output.

**-v**, **--verbosity** _LEVEL_
> One of `quiet`, `minimal` (the default), `normal`, `detailed`, `diagnostic`.

# DESCRIPTION

**dotnet publish** compiles an application and lays out everything needed to run it into one directory. That is more than `dotnet build` produces: alongside the assemblies it writes a `.deps.json` listing every dependency, a `.runtimeconfig.json` describing the runtime the app expects, and the dependencies themselves copied out of the NuGet cache. It is the only officially supported way to prepare a .NET app for deployment.

The main choice is **framework-dependent** versus **self-contained**. Framework-dependent output is small and portable across architectures but requires a matching .NET runtime on the target. Self-contained output bundles the runtime, so it runs anywhere, at the cost of tens of megabytes and of being tied to one RID.

Beyond that, several MSBuild properties reshape the output. `PublishSingleFile` bundles everything into one executable (which implies self-contained). `PublishTrimmed` removes IL that static analysis can prove unreachable. `PublishReadyToRun` precompiles assemblies ahead of time to cut startup latency, and `PublishAot` compiles to a native binary with no IL or JIT at all.

The command is a thin front end to MSBuild's `Publish` target, so any MSBuild property or publish profile applies, and `-c` and `-o` simply map onto the `Configuration` and `PublishDir` properties.

# CAVEATS

The default configuration changed: with the .NET 8 SDK and later, `dotnet publish` uses **Release** for `net8.0`+ targets, where older SDKs defaulted to Debug. Scripts that relied on the old behaviour, or that pass `-c Debug` believing it to be the default, need reviewing.

Trimming and AOT are the sharp edges. Both rely on static analysis, so code reached only through reflection or dynamic loading can be removed or fail to compile, and the failure usually appears at runtime rather than at publish time. Test trimmed output, and heed the trim warnings rather than suppressing them.

Publishing a *solution* with `-o` is an error in recent SDKs, because all projects' outputs would collide in one directory; use the `PublishDir` property instead. Publishing into a folder underneath the project directory makes successive runs nest output inside itself. And `--no-build` quietly implies `--no-restore`, so a stale `bin` directory will be published without complaint.

# HISTORY

**dotnet publish** arrived with the first .NET Core SDK in **2016** and replaced the platform-specific packaging that .NET Framework applications had needed. Its capabilities have widened with each release: self-contained deployment, then single-file bundling and ReadyToRun in .NET Core 3, trimming made viable in .NET 6, and Native AOT from .NET 7 onward, which together turned a runtime once seen as heavyweight into one that can produce small, dependency-free native executables.

# INSTALL

```dnf: sudo dnf install dotnet-host```

```pacman: sudo pacman -S dotnet-host```

```apk: sudo apk add dotnet-host```

```brew: brew install dotnet```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dotnet](/man/dotnet)(1), [dotnet-build](/man/dotnet-build)(1), [dotnet-run](/man/dotnet-run)(1), [dotnet-restore](/man/dotnet-restore)(1), [msbuild](/man/msbuild)(1)

# RESOURCES

```[Source code](https://github.com/dotnet/sdk)```

```[Documentation](https://learn.microsoft.com/en-us/dotnet/core/tools/dotnet-publish)```

<!-- verified: 2026-07-14 -->

