SUMMARY = "Inventory to Sensor config for Ethanol"
PR = "r1"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${PHOSPHORBASE}/COPYING.apache-2.0;md5=34400b68072d710fecd0a2940a0d1658"

inherit native
inherit phosphor-ipmi-host

PROVIDES += "virtual/phosphor-ipmi-inventory-sel"

SRC_URI += "file://sel-config.yaml"

S = "${WORKDIR}"

do_install() {
        # This recipe would provide the sample inventory to sensor config
        # mapping, for non-mrw machines.

        DEST=${D}${sensor_datadir}
        install -d ${DEST}
        install sel-config.yaml ${DEST}/invsensor.yaml
}
