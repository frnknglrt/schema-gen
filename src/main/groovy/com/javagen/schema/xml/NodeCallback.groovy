package com.javagen.schema.xml

import com.javagen.schema.model.MClass
import com.javagen.schema.model.MEnum
import com.javagen.schema.model.MModule
import com.javagen.schema.model.MProperty
import com.javagen.schema.xml.node.Any
import com.javagen.schema.xml.node.AnyAttribute
import com.javagen.schema.xml.node.Attribute
import com.javagen.schema.xml.node.Body
import com.javagen.schema.xml.node.ComplexType
import com.javagen.schema.xml.node.Element
import com.javagen.schema.xml.node.Schema
import com.javagen.schema.xml.node.SimpleType
import com.javagen.schema.xml.node.TextOnlyType

/**
 * Allows fine-tunning of generated target language code. Subclasses may apply technology-specific annotations and other
 * implementation details. These methods are usualy the last thing called after the conversion (SchemaToJava,
 * SchemaToSwift, etc.) code has finished.
 * TODO extends to support Union, List, Group, AttributeGroup, sequence, etc.
 */
class NodeCallback
{
    void gen(Schema schema, MModule module) { }
    void gen(Element element, MProperty property) {  }
    void gen(Attribute attribute, MProperty property) {  }
    void gen(AnyAttribute anyAttribute, MProperty property) {  }
    void gen(Any anyNode, MProperty property) {  }
    void gen(Any anyNode, MClass anyClass) { }
    void gen(Body body, MProperty property) {  }
    void gen(TextOnlyType textOnlyType, MEnum enumClass) {  }
    void gen(SimpleType simpleType, MClass clazz) {  }
    void gen(ComplexType complexType, MClass clazz) {  }
    void gen(Element element, MClass clazz) {  }
}