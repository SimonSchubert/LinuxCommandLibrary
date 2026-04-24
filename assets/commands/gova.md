# TAGLINE

Build and hot-reload native desktop apps written with the Gova Go GUI framework

# TLDR

**Install** the CLI

```go install github.com/nv404/gova/cmd/gova@latest```

**Start the dev loop** with file-watching and hot reload

```gova dev```

**Build and run** once without watching for changes

```gova run```

**Compile a release binary** for the current platform

```gova build```

**Build a stripped, smaller release binary**

```gova build -ldflags "-s -w"```

**Build with a custom output name**

```gova build -o [myapp]```

**Run dev loop against a specific entry package**

```gova dev [./cmd/myapp]```

# SYNOPSIS

**gova** _command_ [_flags_] [_package_]

# PARAMETERS

**dev**
> Watch the working directory, rebuild on file save, and relaunch the window. Ignores **.git**, **node_modules**, **vendor**, and **_test.go** files.

**run**
> Build and launch the application once without starting a file watcher. Useful for CI pipelines or one-shot verifications.

**build**
> Compile a single static binary for the host platform. Accepts Go build flags such as **-ldflags** and **-o**.

**-ldflags** _flags_
> Pass linker flags through to the underlying **go build** call (e.g. **"-s -w"** to strip symbols).

**-o** _name_
> Set the output binary name produced by **gova build**.

# DESCRIPTION

**Gova** is a declarative GUI framework for Go that emits a single static binary for macOS, Windows, and Linux. The **gova** CLI wraps **go build** and **go run** with file-watching, cgo setup, and platform-specific native toolkit plumbing so developers can iterate quickly on a Gova application without hand-writing build tooling.

Components are written in pure Go with a reactive state model and typed props. Typed platform dialogs (file pickers, alerts, notifications) are exposed through the framework and linked against native system libraries via cgo.

During **gova dev**, saving any watched **.go** file triggers an incremental rebuild and relaunches the window, preserving development flow. **gova build** produces a release-ready binary that can be distributed without a runtime dependency on Go.

# CAVEATS

The project is **pre-1.0** — the CLI surface and framework API are still evolving. Requires **Go 1.26+** and a working **C toolchain** on every target platform because of cgo. The name collides with unrelated Go packages (**golang-collections/gova**), with **govc** (VMware vSphere CLI), and with **govm** (Go version manager) — none of which are related.

# HISTORY

Gova was created by **NV404** and published at **github.com/NV404/gova** with documentation at **gova.dev**. It grew out of the wider movement to build native desktop UIs in Go (alongside Fyne and Wails) while keeping the developer experience closer to modern reactive frameworks.

# SEE ALSO

[go](/man/go)(1), [wails](/man/wails)(1), [fyne](/man/fyne)(1)
