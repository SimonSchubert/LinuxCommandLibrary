#!/usr/bin/env bash
# Package the Qt Linux GUI into the tarball layout consumed by lcl-gui-bin.
#
# Usage: package-linux-gui.sh <version> <arch>
#   version     app version, e.g. 4.8.0
#   arch        x86_64 or aarch64 (matches AUR arch names)
#
# CMake, Ninja, a C++ compiler, and Qt 6 (Core/Gui/Qml/Quick/Svg) must already
# be on PATH. The x86_64 AUR binary has to be linked against Arch's Qt; see
# aur/lcl-gui-bin/PKGBUILD.
set -euo pipefail

if [[ $# -ne 2 ]]; then
  echo "usage: $0 <version> <arch>" >&2
  exit 2
fi

VERSION=$1
ARCH=$2

case "$ARCH" in
  x86_64 | aarch64) ;;
  *)
    echo "arch must be x86_64 or aarch64, got: $ARCH" >&2
    exit 2
    ;;
esac

ROOT=$(cd "$(dirname "$0")/.." && pwd)
cd "$ROOT"

cmake -S linuxApp -B build-linuxApp \
  -G Ninja \
  -DCMAKE_BUILD_TYPE=Release \
  -DCMAKE_INSTALL_PREFIX=/usr

cmake --build build-linuxApp --parallel
ctest --test-dir build-linuxApp --output-on-failure
rm -rf linux-gui-destdir
DESTDIR="$ROOT/linux-gui-destdir" cmake --install build-linuxApp

STAGE="lcl-gui-${VERSION}"
rm -rf "$STAGE"
mkdir -p "$STAGE"
cp -a linux-gui-destdir/usr/. "$STAGE/"
cp LICENSE "$STAGE/LICENSE"
install -Dm644 desktopApp/icon.png "$STAGE/share/icons/lcl-gui.png"

test -x "$STAGE/bin/lcl-gui"
test -f "$STAGE/share/applications/lcl-gui.desktop"
test -d "$STAGE/share/lcl/assets"
test -d "$STAGE/share/lcl/icons"

TARBALL="LinuxCommandLibrary-${VERSION}-linux-gui-${ARCH}.tar.gz"
tar czf "$TARBALL" "$STAGE"
echo "Wrote $TARBALL ($(du -h "$TARBALL" | cut -f1))"
