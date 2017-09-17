require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

PROVIDES += "u-boot"

SRCREV = "84217e70d08e6c720ba19429b86d295515b56733"
SRC_URI = "git://github.com/francpalm72/u-boot_2016.11.git;protocol=git;"

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION ?= ""

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(marta)"
